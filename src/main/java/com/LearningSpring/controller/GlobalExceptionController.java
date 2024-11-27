package com.LearningSpring.controller;

import com.LearningSpring.exception.VehicleNotFoundException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalExceptionController {


    @GetMapping("/exception")
    public String handleGlobalException(){
        throw new RuntimeException();
    }

    @GetMapping("/exception1")
    public String multipleException1(){
        throw new NullPointerException();
    }

    @GetMapping("/exception2")
    public String multipleException2(){
        throw new ArrayIndexOutOfBoundsException();
    }

    @GetMapping("/exception3")
    public String multipleException3(){
        throw new ArithmeticException();
    }

    @GetMapping("/vehicleNotFoundException")
    public String handleVehicleNotFoundException(){
        throw  new VehicleNotFoundException("Vehicle details not found");
    }

    @PostMapping("/home/createHome")
    public String createHome(@RequestParam String homeName) {
        if (StringUtils.isNotEmpty(homeName)) {
            return ("Your Dream Home - " + homeName + " Is Ready.");
        }
        return "Please Share Your Home Name";
    }
}