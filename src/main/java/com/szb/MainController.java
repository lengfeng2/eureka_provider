package com.szb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/home")
    public String home() {
        System.out.println("get in");
        return "Spring Cloud ,hello world";
    }
}
