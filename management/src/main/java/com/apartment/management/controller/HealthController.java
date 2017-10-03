package com.apartment.management.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	
	private static final Logger logger = LoggerFactory.getLogger(HealthController.class);
	
	@RequestMapping(value="/health",method= {RequestMethod.POST,RequestMethod.GET})
	public String healthCheck() {
		logger.info("Exited health Controller");
		return "200 ok";
	}

}
