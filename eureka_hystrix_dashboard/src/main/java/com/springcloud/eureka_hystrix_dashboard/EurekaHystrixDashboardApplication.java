package com.springcloud.eureka_hystrix_dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class EurekaHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaHystrixDashboardApplication.class, args);
	}

}
