package io.github.kevindoestechs.marketplace.controller;

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

}
