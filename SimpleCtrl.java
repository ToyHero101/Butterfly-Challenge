package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleCtrl {

    @RequestMapping("/test")
    public String sample() {
        return "test";
    }
}
