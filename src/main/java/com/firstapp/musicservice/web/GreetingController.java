package com.firstapp.musicservice.web;

import com.firstapp.musicservice.config.MusicServiceProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final MusicServiceProperties musicServiceProperties;

    public GreetingController(MusicServiceProperties musicServiceProperties) {
        this.musicServiceProperties = musicServiceProperties;
    }

    @GetMapping("/greeting")
    public String greeting() {
        return musicServiceProperties.greet();
    }

}
