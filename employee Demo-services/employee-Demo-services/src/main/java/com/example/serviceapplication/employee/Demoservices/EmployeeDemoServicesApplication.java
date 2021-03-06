package com.example.serviceapplication.employee.Demoservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients 
public class EmployeeDemoServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDemoServicesApplication.class, args);
		System.out.println("EMP Services is running");
	}

	@Bean
	@LoadBalanced
	public RestTemplate resttemplte() {
		return new RestTemplate();

	}
}
