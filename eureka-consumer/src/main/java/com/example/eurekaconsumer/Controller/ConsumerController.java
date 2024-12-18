package com.example.eurekaconsumer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/2")
    public String test() {

        String forObject = restTemplate.getForObject("http://service-provider:8001/test/1?args=32", String.class);
        return forObject;
    }
}
