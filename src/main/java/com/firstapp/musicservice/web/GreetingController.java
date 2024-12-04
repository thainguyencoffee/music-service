package com.firstapp.musicservice.web;

import com.firstapp.musicservice.config.FirstappProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final FirstappProperties firstappProperties;

    public GreetingController(FirstappProperties firstappProperties) {
        this.firstappProperties = firstappProperties;
    }

    @GetMapping("/greeting")
    public String greeting() {
        return firstappProperties.greet();
    }

}
