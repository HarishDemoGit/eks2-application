package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/eks2")
public class MainController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user")
    public String sample() {
        return "HI THIS IS EKS2!";
    }

    @PostMapping("/post")
    public String sample_01(String name) {
        return "hi I AM EKS2";
    }

    @GetMapping("/call-eks1")
    public String callEks1() {
        String url = "http://172.20.18.180:8085/eks1/user";
        return restTemplate.getForObject(url, String.class);
    }
}
