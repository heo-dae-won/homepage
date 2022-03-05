package com.heodae.homepage.home.api.common;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CommRestTemplate {
    private final RestTemplate restTemplate;

    public CommRestTemplate(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }

    public String get(String url){
        return restTemplate.getForObject(url, String.class);
    }
}
