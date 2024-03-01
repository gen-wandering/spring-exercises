package com.springexercises.partb.cachingaspect;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(* com.springexercises.partb.cachingaspect.*.*(..))")
    private void localGetMethods() {
    }

    @Pointcut("execution(int *(..))")
    private void integerReturnType() {
    }

    @Pointcut("execution(String *(..))")
    private void stringReturnType() {
    }

    @Pointcut("localGetMethods() && integerReturnType()")
    public void localIntReturnMethods() {
    }

    @Pointcut("localGetMethods() && stringReturnType()")
    public void localStringReturnMethods() {
    }
}
