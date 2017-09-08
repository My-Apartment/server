package com.apartment.management.service.impl;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apartment.management.dao.ApartmentDao;
import com.apartment.management.domain.Apartment;
import com.apartment.management.objects.ApartmentRequest;
import com.apartment.management.objects.ApartmentResponse;
import com.apartment.management.service.ApartmentService;

@Service
public class ApartmentServiceImpl implements ApartmentService {
	
	@Autowired
	private ApartmentDao apartmentDao;
	
	@Override
	public ApartmentResponse addApartmentDetails(ApartmentRequest apartmentRequest) {
		ApartmentResponse aResponse = new ApartmentResponse();
		DozerBeanMapper mapper = new DozerBeanMapper();
		Apartment apartment = new Apartment();
		apartment.setAddress(apartmentRequest.getAddress());
		apartment.setAddress("Test Address");
		apartment.setApartmentName("MyApartMent");
		apartment.setCity("Banglore");
		apartment.setFloors(7);
		apartment.setOneBHK(7);
		apartment.setRetired(false);
		apartment.setThreeBHK(7);
		Apartment apartment1 = apartmentDao.save(apartment);
		return mapper.map(apartment1, ApartmentResponse.class);
	}
	
	@Override
	public ApartmentResponse updateApartmentDetails(ApartmentRequest apartmentRequest) {

		return null;
	}

	@Override
	public void removeApartment(ApartmentRequest apartmentRequest) {
		Apartment apartment = apartmentDao.getApartmentDetails(1);
		// TODO Auto-generated method stub
		apartmentDao.removeApartment(apartment.getId());
		return;
	}
	
	@Override
	public ApartmentResponse fetchApartmentDetails(ApartmentRequest apartmentRequest) {
		DozerBeanMapper mapper = new DozerBeanMapper();
		Apartment apartment= apartmentDao.getApartmentDetails(2);
		return mapper.map(apartment, ApartmentResponse.class);
	}

}
