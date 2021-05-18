package com.example.serviceapplication.allgetway.Demoservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AllgetwayDemoServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllgetwayDemoServicesApplication.class, args);
		System.out.println("Running getway Services Application");
	}

}
