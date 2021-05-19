package com.example.hystrixdashboarddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
@EnableHystrix
//@EnableEurekaClient
@EnableAutoConfiguration
public class HystrixDashboardDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardDemoApplication.class, args);
		System.out.println("Hystrix Dashboard Application running");
	}

}
