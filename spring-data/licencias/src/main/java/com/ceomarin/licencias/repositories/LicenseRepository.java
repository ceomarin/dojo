package com.ceomarin.licencias.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ceomarin.licencias.models.License;
import com.ceomarin.licencias.models.Person;

@Repository
public interface LicenseRepository extends CrudRepository<License,Long> {

	List<License> findAll();
	
	Optional<License> findById(Long id);
	
	License findTopByOrderByNumberDesc();
}
