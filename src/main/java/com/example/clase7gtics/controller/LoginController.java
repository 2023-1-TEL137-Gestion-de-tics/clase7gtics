package com.example.clase7gtics.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginForm() {
        return "loginForm";
    }
}
