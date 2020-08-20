package com.wss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloHtml {
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
