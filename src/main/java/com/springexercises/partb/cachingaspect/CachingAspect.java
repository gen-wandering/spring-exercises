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
            pointcut = "com.springexercises.partb.cachingaspect.Pointcuts.localIntReturnMethods()",
            returning = "retVal"
    )
    public void cacheIntReturnValue(JoinPoint joinPoint, Object retVal) {
        cache.put(joinPoint.getSignature().toString(), retVal);
        System.out.println("CachingAspect[cacheIntReturnValue advise]: " + retVal);
    }

    @AfterReturning(
            pointcut = "com.springexercises.partb.cachingaspect.Pointcuts.localStringReturnMethods()",
            returning = "retVal"
    )
    public void cacheStringReturnValue(JoinPoint joinPoint, Object retVal) {
        cache.put(joinPoint.getSignature().toString(), retVal);
        System.out.println("CachingAspect[cacheStringReturnValue advise]: " + retVal);
    }
}