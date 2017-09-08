package com.apartment.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apartment.management.objects.ApartmentRequest;
import com.apartment.management.objects.ApartmentResponse;
import com.apartment.management.service.impl.ApartmentServiceImpl;

@RestController(value="/apartment")
public class ApartmentController {
	
	@Autowired
	private ApartmentServiceImpl apartmentService;
	
	@PostMapping("/addDetails")
	private ApartmentResponse addApartment(ApartmentRequest apartmentRequest) {
		ApartmentResponse apartmentResponse = new ApartmentResponse();
		apartmentResponse = apartmentService.addApartmentDetails(apartmentRequest);
		return apartmentResponse;
	}
	
	@GetMapping("/getDetails")
	private ApartmentResponse updateApartmentDetails(ApartmentRequest apartmentRequest) {
		ApartmentResponse apartmentResponse = new ApartmentResponse();
		apartmentResponse = apartmentService.fetchApartmentDetails(apartmentRequest);
		return apartmentResponse;
	}
	
	@DeleteMapping("/deleteDetails")
	private boolean removeApartment(ApartmentRequest apartmentRequest) {
		apartmentService.removeApartment(apartmentRequest);
		return true;
	}

}
