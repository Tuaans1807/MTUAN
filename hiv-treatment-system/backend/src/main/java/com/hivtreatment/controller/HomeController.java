package com.hivtreatment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "redirect:/test.html";
    }

    @GetMapping("/test")
    public String test() {
        return "redirect:/test.html";
    }
} 