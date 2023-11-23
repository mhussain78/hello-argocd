package com.mhussain.helloargocd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.time.Instant.now;

@RequestMapping("/api/greetings")
@RestController
public class GreetingController {

    @GetMapping
    Greeting greeting() {
        return new Greeting("Hello Heider Hussain @ " + now());
    }

}