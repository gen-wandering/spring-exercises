package com.springexercises.aop.validationaspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ValidationAspect {

    @Pointcut("execution(* com.springexercises.aop.validationaspect.*.*(..))")
    private void serviceSetters() {
    }

    @Around(value = "serviceSetters() && args(int, String)")
    public Object validateArguments(ProceedingJoinPoint joinPoint) throws Throwable {

        int id = (int) joinPoint.getArgs()[0];
        String apiKey = (String) joinPoint.getArgs()[1];

        System.out.println("validateArguments: validation process");

        if (id > 0) {
            if (apiKey.split("-").length == 3) {
                System.out.println("validateArguments: validation succeeded");
                return joinPoint.proceed();
            } else {
                System.out.println("validateArguments: validation failed due to invalid apiKey");
            }
        } else {
            System.out.println("validateArguments: validation failed due to invalid id");
        }
        return false;
    }
}