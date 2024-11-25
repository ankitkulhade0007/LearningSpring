package com.LearningSpring.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class VehicleStartCheckAspect {

    @Before("execution(* com.LearningSpring.services.*.*(..)) && args(vehicleStarted,..)")
    public void checvehicleStarted(JoinPoint joinPoint, boolean vehicleStarted) throws Throwable{
        if(!vehicleStarted){
            throw new RuntimeException("Vehicle not started");
        }
    }
}