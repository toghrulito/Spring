package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CydeoController {
    @RequestMapping("/cydeo")
    public String logIn(){
        return "cydeo/Cydeo.html";
    }

}
