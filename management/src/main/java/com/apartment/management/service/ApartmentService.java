package com.apartment.management.service;

import com.apartment.management.objects.ApartmentRequest;
import com.apartment.management.objects.ApartmentResponse;

public interface ApartmentService {

	ApartmentResponse addApartmentDetails(ApartmentRequest apartmentRequest);
	
	ApartmentResponse updateApartmentDetails(ApartmentRequest apartmentRequest);
	
	ApartmentResponse fetchApartmentDetails(ApartmentRequest apartmentRequest);
	
	void removeApartment(ApartmentRequest apartmentRequest);
	
}
