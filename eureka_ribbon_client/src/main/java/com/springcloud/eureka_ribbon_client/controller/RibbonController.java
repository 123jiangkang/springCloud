package com.springcloud.eureka_ribbon_client.controller;

import com.springcloud.eureka_ribbon_client.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Version
 * @Author kang.jiang
 * @Created 2020年06月03  16:03:01
 * @Description <p>
 * @Modification <p>
 * Date Author Version Description
 * <p>
 * 2020年06月03  kang.jiang  create file
 */
@RestController
@RequestMapping("/test")
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping("/ribbon")
    public String testRibbon(){
        return ribbonService.testRibbon();
    }
}
