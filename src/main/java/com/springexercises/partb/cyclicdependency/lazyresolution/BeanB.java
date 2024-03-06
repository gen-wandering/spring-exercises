package com.springexercises.partb.cyclicdependency.lazyresolution;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanB implements SpecialBeanInterface {
    private final BeanA beanA;

    // CGLIB Proxy-object injected
    public BeanB(@Lazy BeanA beanA) {
        System.out.println("BeanB constructor dependency: " + beanA.getClass());
        this.beanA = beanA;
    }

    public BeanA getBeanA() {
        System.out.println("getBeanA");
        return beanA;
    }
}
