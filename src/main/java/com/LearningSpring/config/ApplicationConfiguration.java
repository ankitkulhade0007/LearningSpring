package com.LearningSpring.config;

import com.LearningSpring.model.Holiday;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//@ComponentScan(basePackages = {"com.LearningSpring"})
public class ApplicationConfiguration {

/*
    @Bean
    @ConditionalOnProperty(name = "feature.enabled", havingValue = "true")
    public Holiday getHoliday(){
        return  new Holiday();
    }

    @Bean
    @ConditionalOnClass(name = "com.LearningSpring.model.Holiday")
    public Holiday getHoliday2(){
        return  new Holiday();
    }*/
}
