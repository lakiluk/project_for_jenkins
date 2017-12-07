package com.example.jenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hi")
public class HelloController {

    @GetMapping(value = "/{name}")
    public String sayHi(@PathVariable("name") String name) {
        return "Hi, " + name + "!";
    }
}
