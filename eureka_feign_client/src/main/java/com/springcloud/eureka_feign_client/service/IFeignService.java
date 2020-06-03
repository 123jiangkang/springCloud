package com.springcloud.eureka_feign_client.service;

import com.springcloud.eureka_feign_client.service.impl.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Version
 * @Author kang.jiang
 * @Created 2020年06月03  16:43:09
 * @Description <p>
 * @Modification <p>
 * Date Author Version Description
 * <p>
 * 2020年06月03  kang.jiang  create file
 */
@FeignClient(value = "EUREKA-CLIENT-TEST",fallback = FeignServiceImpl.class)
@Service
public interface IFeignService {

    @RequestMapping("/eureka_main/info")
    String feignTest();

}
