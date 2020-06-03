package com.springcloud.eureka_feign_client.service.impl;

import com.springcloud.eureka_feign_client.service.IFeignService;
import org.springframework.stereotype.Service;

/**
 * @Version
 * @Author kang.jiang
 * @Created 2020年06月03  17:14:39
 * @Description <p>
 * @Modification <p>
 * Date Author Version Description
 * <p>
 * 2020年06月03  kang.jiang  create file
 */
@Service
public class FeignServiceImpl implements IFeignService {
    @Override
    public String feignTest() {
         return  "error request ! ! !";
    }
}
