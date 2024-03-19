package com.springexercises.partb.cyclicdependency.lazyresolution;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LazyCDResolutionMain {
    public static void main(String[] args) throws InterruptedException {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        BeanA beanA = context.getBean("beanA", BeanA.class);
        BeanB beanB = context.getBean("beanB", BeanB.class);

        Thread.sleep(3000);

        System.out.println(beanA.getBeanB());
        System.out.println(beanB.getBeanA());
    }
}