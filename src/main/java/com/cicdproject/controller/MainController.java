package com.cicdproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {


    private final RestTemplate restTemplate;

    public MainController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/hello")
    public String helloWorld(Model model) {

        ResponseEntity<String> entity = restTemplate.getForEntity("http://internal-be-be-be-be-be-be-1-353624958.ap-northeast-2.elb.amazonaws.com:8081/", String.class);

        model.addAttribute("message", entity.getBody());

        return "ci-cd";
    }


}
