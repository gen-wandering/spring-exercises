package com.springexercises.partb.cachingaspect;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(* com.springexercises.partb.cachingaspect.*.get*(..))")
    public void localGetMethods() {
    }

    @Pointcut("@annotation(Track)")
    public void specialMethods() {
    }
}