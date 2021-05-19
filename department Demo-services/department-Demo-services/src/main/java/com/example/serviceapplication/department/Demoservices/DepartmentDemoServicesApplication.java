package com.example.serviceapplication.department.Demoservices;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class DepartmentDemoServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentDemoServicesApplication.class, args);
		System.out.println("department Application is running");
	}

}
