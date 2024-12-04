package com.firstapp.musicservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "music-service")
public record MusicServiceProperties(
        String greet
) {
}
