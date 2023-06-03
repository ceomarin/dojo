package com.ceomarin.licencias.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceomarin.licencias.models.License;
import com.ceomarin.licencias.models.Person;
import com.ceomarin.licencias.repositories.LicenseRepository;
import com.ceomarin.licencias.repositories.PersonRepository;

@Service
public class MainService {
	private static int contador;
	
	private static String numLicenseGenerated() {
		String str = String.valueOf(++contador);
		int width = 6;
		String formatted = String.format("%0" + width + "d", Integer.valueOf(str));
		return formatted;
		}

	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private LicenseRepository licenseRepository;
	
	
	public Person createPerson(Person p) {
		return personRepository.save(p);
	}
	
	public Person findPerson(Long id) {
		Optional<Person> optionalPerson = personRepository.findById(id);
		if (optionalPerson.isPresent()) {
			return optionalPerson.get();
		} else {
			return null;
		}
	}
	
	public List<Person> findPersons(){
		return personRepository.findAll();
	}
	
	public List<Person> findAllPersonsLicenseNull(){
		return personRepository.findByLicenseIdIsNull();
	}
	
	public License createLicense(License l) {
		l.setNumber(numLicenseGenerated());
		return licenseRepository.save(l);		
	}

	
	public License findLicense(Long id) {
		Optional<License> optionalLicense = licenseRepository.findById(id);
		if (optionalLicense.isPresent()) {
			return optionalLicense.get();
		} else {
			return null;
		}
	}
}
