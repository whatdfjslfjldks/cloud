package com.pat.eurekaprovider8002.TestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/2")
    public String test(String args){
        return "from 8002: "+args;
    }
}
