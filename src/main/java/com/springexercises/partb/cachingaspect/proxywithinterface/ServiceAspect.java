package com.springexercises.partb.cachingaspect.proxywithinterface;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ServiceAspect {

    @Pointcut("execution(* com.springexercises.partb.cachingaspect.proxywithinterface.Service.*())")
    private void serviceInterfaceMethods() {
    }

    @Pointcut("execution(* com.springexercises.partb.cachingaspect.proxywithinterface.ServiceImpl.*())")
    private void serviceMethods() {
    }

    /*
     * Both "serviceInterfaceMethods()" and "serviceMethods()" pointcuts
     * point at the same method: "service()", available in the Service interface.
     *
     * "extendedServiceMethod()" of the ServiceImpl is unavailable for AOP because
     * of JDK dynamic proxies proxying mechanism.
     * */
    @Before(value = "serviceInterfaceMethods()")
    public void beforeMethods(JoinPoint joinPoint) {
        System.out.println("Before advice: " + joinPoint.getSignature());
    }
}