package com.springexercises.partb.cyclicdependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    private BeanA beanA;

    public BeanB() {
        System.out.println("BeanB constructor");
    }

    @Autowired
    public void setBeanA(BeanA beanA) {
        this.beanA = beanA;
    }
}
