package com.restapi.RestApiDemo.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControllerImpl implements ApiController{
    @Override
    public ResponseEntity<String> checkTest() {
        return ResponseEntity.ok("hello my first api");
    }

    @Override
    public String checkme() {
        return "hello";
    }
}
