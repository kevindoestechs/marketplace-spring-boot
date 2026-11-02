package io.github.kevindoestechs.marketplace.controller;

import io.github.kevindoestechs.marketplace.shared.exception.BadRequestException;
import io.github.kevindoestechs.marketplace.shared.exception.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //because of server.servlet.context-path=api/v1 in app.properties,
    //the endpoint will start with -> localhost:8080/api/v1

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @GetMapping("/bad-request")
    public ResponseEntity<String> badRequestError(){
        throw new BadRequestException("Bad Request");
    }

    @GetMapping("/not-found")
    public ResponseEntity<String> notFoundError(){
        throw new ResourceNotFoundException("Resource Not Found");
    }

    @GetMapping("/generic-error")
    public ResponseEntity<String> genericError(){
        throw new RuntimeException("Generic Error");
    }
}
