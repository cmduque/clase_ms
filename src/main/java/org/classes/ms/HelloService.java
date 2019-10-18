package org.classes.ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloService")
public class HelloService {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello world!";
    }
}