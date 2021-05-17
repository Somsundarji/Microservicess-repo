package com.example.serviceapplication.employee.Demoservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class EmployeeDemoServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDemoServicesApplication.class, args);
		System.out.println("EMP Services is running");
	}

	@Bean
	public RestTemplate resttemplte() {
		return new RestTemplate();

	}
}