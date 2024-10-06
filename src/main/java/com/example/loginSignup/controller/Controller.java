package com.example.loginSignup.controller;


import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@org.springframework.stereotype.Controller
@RequestMapping("/api")
public class Controller {


    @RequestMapping("/signup")
    public String showSignupPage(){
        return "signupPage";
    }

    @RequestMapping("/login")
    public String showLoginPage(){
        return "loginPage";
    }

}
