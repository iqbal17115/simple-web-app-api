package com.iqbal.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
       return "Welcome To Md. Iqbal Hossain!";
    }

    @RequestMapping("/about")
    public String about() {
        return "We don't teach, we Educate!";
    }
}