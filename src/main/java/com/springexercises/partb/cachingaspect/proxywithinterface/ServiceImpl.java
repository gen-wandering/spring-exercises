package com.springexercises.partb.cachingaspect.proxywithinterface;

public class ServiceImpl implements Service {
    @Override
    public void service() {
        System.out.println("service() method form ServiceInterface");
    }

    /*
     * Unavailable for AOP due to JDK dynamic proxies mechanism
     * */
    public void extendedServiceMethod() {
        System.out.println("extendedServiceMethod() form Service class");
    }
}