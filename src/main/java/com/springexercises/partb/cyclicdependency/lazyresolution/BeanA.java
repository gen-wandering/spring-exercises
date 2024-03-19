package com.springexercises.partb.cyclicdependency.lazyresolution;

import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private final SpecialBeanInterface beanB;

    /*
     * JDK dynamic proxy proxy-object injected
     * if @Lazy is used on beanB argument
     **/

    // BeanB object is injected
    public BeanA(SpecialBeanInterface beanB) {
        System.out.println("BeanA constructor. Dependency: " + beanB.getClass());
        this.beanB = beanB;
    }

    public SpecialBeanInterface getBeanB() {
        System.out.print("In BeanA - getBeanB: ");
        return beanB;
    }
}
