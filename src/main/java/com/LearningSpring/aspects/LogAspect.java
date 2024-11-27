package com.LearningSpring.aspects;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Component
@Aspect
@Order(2)
@Slf4j
public class LogAspect {

    @Around("execution(* com.LearningSpring.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Aspect implementation of Logger.");
        log.info(joinPoint.getSignature().toString() + "method execution start");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant end = Instant.now();
        long elapsedTime  = Duration.between(start, end).toMillis();
        log.info("Time took to execute the method : "+elapsedTime);
        log.info(joinPoint.getSignature().toString() + " method execution end");
    }

    @Around("@annotation(com.LearningSpring.interfaces.LogAspect)")
    public void logWithAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info(joinPoint.toString() + " method execution start");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        log.info("Time took to execute the method : "+timeElapsed);
        log.info(joinPoint.getSignature().toString() + " method execution end");
    }

    @AfterThrowing(value = "execution(* com.LearningSpring.services.*.*(..))",throwing = "ex")
    public  void logException(JoinPoint joinPoint , Exception  ex){
        log.info(joinPoint.getSignature().toString()
                + " An exception thrown with the help of"
                + " @AfterThrowing which happened due to : "
                + ex.getMessage());
    }

    @AfterReturning(value = "execution(* com.LearningSpring.services.*.*(..))",returning = "retVal")
    public void logStatus(JoinPoint joinPoint, Object retVal) {
        log.info(joinPoint.getSignature().toString()
                + " Method successfully processed with the status "
                + retVal.toString());
    }
}













