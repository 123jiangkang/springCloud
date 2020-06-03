package com.springcloud.eureka_feign_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients  //开启 feign 支持
public class EurekaFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignClientApplication.class, args);
	}

}

