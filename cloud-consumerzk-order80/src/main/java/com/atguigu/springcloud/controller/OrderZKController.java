package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderZKController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String INVOME_URL = "http://cloud-provider-payment";

    @GetMapping(value = "/consumer/payment/zk")
    public String payment(){
        String result = restTemplate.getForObject(INVOME_URL+"/payment/zk",String.class);
        return result;
    }

}
