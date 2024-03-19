package com.springexercises.partb.cachingaspect.proxywithinterface;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * It is impossible to get bean of type "ServiceImpl" because it is
 * being proxied by Spring using JDK dynamic proxies proxying mechanism.
 *
 * So "ServiceImpl" is available only thought "Service" interface. To get
 * "ServiceImpl" CGLIB proxies can be used instead of JDK dynamic proxies.
 * */

public class ProxyWithInterfaceMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Service service = context.getBean("service", Service.class);

        service.service();
    }
}