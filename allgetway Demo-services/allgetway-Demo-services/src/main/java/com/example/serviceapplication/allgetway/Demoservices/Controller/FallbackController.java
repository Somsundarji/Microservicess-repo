package com.example.serviceapplication.allgetway.Demoservices.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallbackController {
	
	 @RequestMapping("/departmentFallBack ")
	    public Mono<String> departmentServiceFallBack() {
	        return Mono.just("department Service is taking too long to respond or is down. Please try again later");
	    }
	    @RequestMapping("/EmployeeservicesFallback")
	    public Mono<String> employeeServiceFallBack() {
	        return Mono.just("employee Service is taking too long to respond or is down. Please try again later");
	    }

}
