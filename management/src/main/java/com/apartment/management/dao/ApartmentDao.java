package com.apartment.management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.apartment.management.domain.Apartment;

public interface ApartmentDao extends JpaRepository<Apartment,Integer>,JpaSpecificationExecutor<Apartment>{
	
	@Query(nativeQuery=true,value="select * from apartment h1 where id=:id and retired=false")	
	public Apartment getApartmentDetails(@Param("id")int id);
		
	@Modifying
	@javax.transaction.Transactional
	@Query(nativeQuery=true,value="update apartment a set a.retired=true where a.id=:id")
	public int removeApartment(@Param("id")int id);
		
}
