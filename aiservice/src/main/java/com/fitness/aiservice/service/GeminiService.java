package com.fitness.aiservice.service;

import org.springframework.web.reactive.function.client.WebClient;

public class GeminiService {
    private final WebClient webClient;

    public GeminiService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.build();
    }
}
