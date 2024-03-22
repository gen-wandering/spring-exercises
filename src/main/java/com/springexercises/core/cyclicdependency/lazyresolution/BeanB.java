package com.springexercises.core.cyclicdependency.lazyresolution;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanB implements SpecialBeanInterface {
    private final BeanA beanA;

    // CGLIB Proxy-object injected
    public BeanB(@Lazy BeanA beanA) {
        System.out.println("BeanB constructor. Dependency: " + beanA.getClass());
        this.beanA = beanA;
    }

    public BeanA getBeanA() {
        System.out.print("In BeanB - getBeanA: ");
        return beanA;
    }
}
