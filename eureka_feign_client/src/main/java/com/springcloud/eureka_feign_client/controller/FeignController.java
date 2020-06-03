package com.springcloud.eureka_feign_client.controller;


import com.springcloud.eureka_feign_client.service.IFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Version
 * @Author kang.jiang
 * @Created 2020年06月03  16:48:18
 * @Description <p>
 * @Modification <p>
 * Date Author Version Description
 * <p>
 * 2020年06月03  kang.jiang  create file
 */
@RestController
@RequestMapping("/test")
public class FeignController {

    @Autowired
    private IFeignService feignService;

    @RequestMapping("/fegin")
    public String test(){
        return feignService.feignTest();
    }
}
