package com.springcloud.eureka_client_test.controller;

import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eureka_main")
public class MainController {

    @Autowired
    @Qualifier("eurekaClient")
    private EurekaClient eurekaClient;

    @Value("${info.message}")
    private String message;

    @RequestMapping("/info")
    public String test() throws Exception {
//        eurekaClient.getNextServerFromEureka();
        return  message;
    }

}
