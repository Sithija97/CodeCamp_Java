package com.example.helloworld.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

@RequestMapping("/")
    public String helloworld() {
    return "Hello Sithija";
}
}
