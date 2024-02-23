package com.example.DmJ5b5954S1Lm5aA4s41RoHS3R2nd12s.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    public AppConfig() {
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}