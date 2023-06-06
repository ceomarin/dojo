package com.ceomarin.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceomarin.dojosninjas.models.Dojo;
import com.ceomarin.dojosninjas.models.Ninja;
import com.ceomarin.dojosninjas.repositories.DojoRepository;
import com.ceomarin.dojosninjas.repositories.NinjaRepository;

@Service
public class MainService {

	@Autowired
	private DojoRepository dojoRepository;
	
	@Autowired
	private NinjaRepository ninjaRepository;
	
	
	public Dojo createDojo(Dojo d) {
		return dojoRepository.save(d);
	}
	
	public List<Dojo> findDojoAll(){
		return dojoRepository.findAll();
	}
	
	public Dojo findDojoById(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if (optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}
	
	public Ninja createNinja(Ninja n) {
		return ninjaRepository.save(n);
	}
	
	
}
