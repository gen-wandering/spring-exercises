package com.springexercises.core.customdicontainer;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class Container {
    private final Map<Class<?>, Object> bindings = new HashMap<>();

    public void bind(Class<?> cls, Object instance) {
        bindings.put(cls, instance);
    }

    public <T> void bind(Class<T> cls) {
        bindings.put(cls, cls);
    }

    public <T> T make(Class<T> cls) {
        if (!bindings.containsKey(cls)) {
            throw new RuntimeException("No binding found for " + cls.getName());
        }
        Object binding = bindings.get(cls);
        if (binding instanceof Class<?>) {
            System.out.println("Creating new instance for " + cls.getSimpleName());
            return cls.cast(createInstance(cls));
        } else {
            System.out.println("Using ready object for " + cls.getSimpleName());
            return cls.cast(binding);
        }
    }

    private <T> T createInstance(Class<T> cls) {
        try {
            Object object = bindings.get(cls);
            if (!(object instanceof Class<?>)) {
                return cls.cast(object);
            }

            Constructor<?>[] constructors = cls.getDeclaredConstructors();

            Constructor<?> constructorToUse = null;
            for (Constructor<?> constructor : constructors) {
                if (constructor.isAnnotationPresent(AddDependency.class)) {
                    constructorToUse = constructor;
                    break;
                }
            }

            if (constructorToUse == null) {
                constructorToUse = cls.getDeclaredConstructor();
            }

            Object[] dependencies = new Object[constructorToUse.getParameterCount()];
            for (int i = 0; i < dependencies.length; i++) {
                dependencies[i] = createInstance(constructorToUse.getParameterTypes()[i]);
            }

            T instance = (T) constructorToUse.newInstance(dependencies);
            bindings.put(cls, instance);

            return instance;

        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance for " + cls.getName(), e);
        }
    }
}