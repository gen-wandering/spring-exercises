package com.springexercises.jdbc.log.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.stream.Collectors;

@Aspect
public class LoggingAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Pointcut("execution(* com.springexercises.jdbc.service.*.*(..))")
    public void allServiceMethods() {
    }

    @Around("allServiceMethods()")
    public Object logAroundAllServiceMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        Object result;

        if (logger.isDebugEnabled() || logger.isTraceEnabled()) {
            long start = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long elapsedTime = System.currentTimeMillis() - start;

            String args = Arrays.stream(proceedingJoinPoint.getArgs())
                    .map(Object::toString)
                    .collect(Collectors.joining(", "));

            logger.debug("Execution of method '" + proceedingJoinPoint.getSignature() +
                         "' with arguments {" + args + "} took " +
                         elapsedTime + " ms and returned '" + result + "'");
        } else {
            result = proceedingJoinPoint.proceed();
            logger.info("Execution of method '" + proceedingJoinPoint.getSignature() + "'");
        }
        return result;
    }
}