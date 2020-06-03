package com.springcloud.eureka_ribbon_client.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.eureka_ribbon_client.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Version
 * @Author kang.jiang
 * @Created 2020年06月03  15:58:48
 * @Description <p>
 * @Modification <p>
 * Date Author Version Description
 * <p>
 * 2020年06月03  kang.jiang  create file
 */
@Service
public class RibbonServiceImpl implements RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "ribbonError") //指定出错之后的回调
    public String testRibbon() {
        return restTemplate.getForObject("http://EUREKA-CLIENT-TEST/eureka_main/info", String.class);
    }

    public String ribbonError(){
        return  "error request ! ! !";
    }
}
