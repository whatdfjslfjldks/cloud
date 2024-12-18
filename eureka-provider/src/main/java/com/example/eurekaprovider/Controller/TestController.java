package com.example.eurekaprovider.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/1")
    public String test(String args){
        return "the args is:"+args;
    }
}
