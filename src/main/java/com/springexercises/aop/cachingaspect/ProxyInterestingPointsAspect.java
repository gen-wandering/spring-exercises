package com.springexercises.aop.cachingaspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ProxyInterestingPointsAspect {

    /*
     * Performs method invocation against proxy
     * */
    @AfterReturning("execution(* com.springexercises.aop.cachingaspect.Person.proxy*(..))")
    public void proxyObjectMethodCall(JoinPoint joinPoint) {
        var proxy = (Person) joinPoint.getThis();

        System.out.println("------------------------");
        System.out.println("proxy.getSurname() call");
        proxy.getSurname();
        System.out.println("------------------------");
    }

    /*
     * Performs self-invocation
     * */
    @AfterReturning("execution(* com.springexercises.aop.cachingaspect.Person.proxy*(..))")
    public void targetObjectMethodCall(JoinPoint joinPoint) {
        var target = (Person) joinPoint.getTarget();

        System.out.println("------------------------");
        System.out.println("target.getSurname() call");
        target.getSurname();
        System.out.println("------------------------");
    }
}
