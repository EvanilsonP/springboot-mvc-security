package com.luv2code.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {
        return "fancy-login";
    }

    // add a request mapping for /access-denied
    @GetMapping("/access-denied")
    public String accessDenied() {
        return "access-denied";
    }
}
