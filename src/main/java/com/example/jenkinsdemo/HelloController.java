package com.example.jenkinsdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hi")
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);

    public HelloController() {
        LOGGER.info("Instance created");
    }

    @GetMapping
    public String ping(){
        return "pong";
    }

    @GetMapping(value = "/{name}")
    public String sayHi(@PathVariable("name") String name) {
        return "Hi, " + name + "!";
    }
}
