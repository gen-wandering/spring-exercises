package com.springexercises.aop.cachingaspect;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(* com.springexercises.aop.cachingaspect.*.get*(..))")
    public void localGetMethods() {
    }

    @Pointcut("@annotation(Track)")
    public void specialMethods() {
    }
}