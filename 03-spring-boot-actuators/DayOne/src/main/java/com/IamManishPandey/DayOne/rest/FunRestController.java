package com.IamManishPandey.DayOne.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that returns "Hello World"

    @GetMapping("/")
    public String sayHello(){
        return "Hello This IamDeadHacker";
    }

    // exposing new endpoint for "workout"

    @GetMapping("/workout")
    public String workout(){
        return sayHello() + " Working Out Today";
    }

    // exposing new endpoint for "workout"

    @GetMapping("/fortune")
    public String fortune(){
        return sayHello() + " Today is your lucky day.";
    }

}
