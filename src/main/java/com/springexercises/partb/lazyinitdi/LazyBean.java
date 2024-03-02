package com.springexercises.partb.lazyinitdi;

import org.springframework.beans.factory.annotation.Autowired;

public class LazyBean {
    private LazyBeanDependency dependency;

    public LazyBean() {
        System.out.println("LazyBean constructor");
    }

    @Autowired
    public void setBeanB(LazyBeanDependency dependency) {
        System.out.println("LazyBean dependency injection");
        this.dependency = dependency;
    }
}
