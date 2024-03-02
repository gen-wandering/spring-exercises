package com.springexercises.partb.lazyinitdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyInitMain {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("******* Context start *******");
        ApplicationContext context = new ClassPathXmlApplicationContext("partb/lazyinitdi/appConfig.xml");

        Thread.sleep(2000);
        System.out.println();

        System.out.println("******* getBean(\"lazyBean\") *******");
        context.getBean("lazyBean");
    }
}
