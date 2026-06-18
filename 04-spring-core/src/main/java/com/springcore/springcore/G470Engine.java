package com.springcore.springcore;

import org.springframework.stereotype.Component;

@Component
public class G470Engine implements Engine {
    @Override
    public String EngineName() {
        return "This Application is for G470 ";
    }
}
