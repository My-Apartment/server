package com.apartment.management.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.apartment.management.service.impl.OwnerServiceImpl;

@RestController(value="/apartment")
public class OwnerController {
	
	private static final Logger logger = LoggerFactory.getLogger(OwnerController.class);
	
	@Autowired
	private OwnerServiceImpl ownerService;
	
	
}
