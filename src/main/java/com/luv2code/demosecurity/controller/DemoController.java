package com.luv2code.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String showHomePage() {
        return "home";
    }

    // request mapping for leaders
    @GetMapping("/leaders")
    public String leadersPage() {
        return "leaders";
    }
}
