package com.binod.simpleWebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String great(){
        System.out.println("Something is building");
        return "Welcome to Simple Webapp!";
    }
    @RequestMapping("/about")
   public String about(){
        return "This is an about page";
   }
}
