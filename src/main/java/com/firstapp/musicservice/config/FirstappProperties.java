package com.firstapp.musicservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "firstapp")
public record FirstappProperties(
        String greet
) {
}
