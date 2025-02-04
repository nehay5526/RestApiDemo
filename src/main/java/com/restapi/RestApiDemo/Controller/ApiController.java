package com.restapi.RestApiDemo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public interface ApiController {
    @GetMapping("/check")
    ResponseEntity<String> checkTest();

    @GetMapping("/")
    String checkme();
}
