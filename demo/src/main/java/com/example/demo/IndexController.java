package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
class IndexController {
    @RequestMapping(name = "/", method = RequestMethod.GET);
    public String index(){
        return "index";
    }
}
