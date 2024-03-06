package com.springexercises.partb.cyclicdependency.setterresolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("beanB")
public class BeanA {
    private BeanB beanB;

    public BeanA() {
        System.out.println("BeanA constructor");
    }

    @Autowired
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }
}
