package com.springexercises.partb.lazyinit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyInitMain {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("******* Context start *******");
        ApplicationContext context = new ClassPathXmlApplicationContext("partb/lazyinit/appConfig.xml");

        Thread.sleep(4000);
        System.out.println();

        System.out.println("******* getBean(\"lazyBean\") *******");
        context.getBean("lazyBean");
    }
}
