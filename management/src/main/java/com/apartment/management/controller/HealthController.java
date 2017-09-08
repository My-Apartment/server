package com.apartment.management.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	
	@RequestMapping(value="/health",method= {RequestMethod.POST,RequestMethod.GET})
	public String healthCheck() {
		return "200 ok";
	}

}
