package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eks2")
public class MainController {

    @GetMapping("/user")
    public String sample() {
        return "HI THIS IS EKS2!";
    }

    @PostMapping("/post")
    public String sample_01(String name) {
        return "hi I AM EKS2";
    }
}
