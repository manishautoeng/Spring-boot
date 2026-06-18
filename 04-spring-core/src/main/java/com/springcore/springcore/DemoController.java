package com.springcore.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Engine EngineStatus;

    @Autowired
    public DemoController(Engine engine) {
        EngineStatus = engine;
    }


    @GetMapping("/engine")
    public String engine(){
         return EngineStatus.EngineName();
    }
}
