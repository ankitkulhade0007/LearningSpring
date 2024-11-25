package com.LearningSpring.exception;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
/*
The HandlerExceptionResolver interface is another way to implement global exception handling in a Spring application.
This interface provides a mechanism to catch exceptions thrown by controllers and resolve them.
To implement a HandlerExceptionResolver, follow these steps:
Create a new class and implement the HandlerExceptionResolver interface.
Override the resolveException() method and provide the logic to handle the exception.
Register the custom HandlerExceptionResolver in the Spring application context.
*/

public class GlobalExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error");
        modelAndView.addObject("errorMessage", "An error has occurred");
        return modelAndView;
    }
}
