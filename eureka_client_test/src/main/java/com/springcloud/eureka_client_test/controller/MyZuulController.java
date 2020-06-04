package com.springcloud.eureka_client_test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Version
 * @Author kang.jiang
 * @Created 2020年06月04  14:20:11
 * @Description <p>
 * @Modification <p>
 * Date Author Version Description
 * <p>
 * 2020年06月04  kang.jiang  create file
 */
@RestController
@RequestMapping("/zuul")
public class MyZuulController {

    @RequestMapping("/main")
    public String zuulMain(){
        return "loacl forward";
    }
}
