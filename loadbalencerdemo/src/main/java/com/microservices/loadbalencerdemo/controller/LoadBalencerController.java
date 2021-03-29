package com.microservices.loadbalencerdemo.controller;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loadbalencing")
public class LoadBalencerController {

	@GetMapping("/test")
	public ResponseEntity<String> getCustomerAddressById() {
		
		System.out.println("testing load balencer project at time  "+ LocalDateTime.now());
		
		return ResponseEntity.ok().body("Load balencing testing........");
	}

}
