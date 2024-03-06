package com.springexercises.partb.cyclicdependency.lazyresolution;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private final SpecialBeanInterface beanB;

    // JDK dynamic proxy proxy-object injected
    public BeanA(@Lazy SpecialBeanInterface beanB) {
        System.out.println("BeanA constructor dependency: " + beanB.getClass());
        this.beanB = beanB;
    }

    public SpecialBeanInterface getBeanB() {
        System.out.println("getBeanB");
        return beanB;
    }
}
