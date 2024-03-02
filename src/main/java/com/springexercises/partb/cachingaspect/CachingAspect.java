package com.springexercises.partb.cachingaspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class CachingAspect {
    private final Map<String, Object> cache = new HashMap<>();

    public Map<String, Object> getCache() {
        return cache;
    }

    @AfterReturning(
            pointcut = "com.springexercises.partb.cachingaspect.Pointcuts.localGetMethods()",
            returning = "retVal"
    )
    public void cacheIntReturnValue(JoinPoint joinPoint, Integer retVal) {
        cache.put(joinPoint.getSignature().toString(), retVal);
        System.out.println("CachingAspect[cacheIntReturnValue advise]: " + retVal);
    }

    @AfterReturning(
            pointcut = "com.springexercises.partb.cachingaspect.Pointcuts.localGetMethods()",
            returning = "retVal"
    )
    public void cacheStringReturnValue(JoinPoint joinPoint, String retVal) {
        cache.put(joinPoint.getSignature().toString(), retVal);
        System.out.println("CachingAspect[cacheStringReturnValue advise]: " + retVal);
    }

    @AfterReturning(
            pointcut = "com.springexercises.partb.cachingaspect.Pointcuts.specialMethods()",
            returning = "retVal"
    )
    public void specialMethodsReturnValue(JoinPoint joinPoint, String retVal) {
        cache.put(joinPoint.getSignature().toString(), retVal);
        System.out.println("CachingAspect[specialMethodsReturnValue advise]: " + retVal);
    }
}