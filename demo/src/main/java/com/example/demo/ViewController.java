package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
@RequestMapping("/")
public class ViewController {
    @GetMapping
    public String view(){
        return "view";
    }
}
