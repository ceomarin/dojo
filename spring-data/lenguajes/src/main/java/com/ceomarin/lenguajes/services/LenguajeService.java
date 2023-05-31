package com.ceomarin.lenguajes.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceomarin.lenguajes.models.Lenguaje;
import com.ceomarin.lenguajes.repositories.LenguajeRepository;

@Service
public class LenguajeService {

	@Autowired
	private LenguajeRepository lenguajeRepository;
	
	public ArrayList<Lenguaje> allLenguajes() {
		return (ArrayList<Lenguaje>) lenguajeRepository.findAll();
	}
	
	public Lenguaje findLenguaje(Long id) {
		Optional<Lenguaje> optionalLenguaje = lenguajeRepository.findById(id);
		if (optionalLenguaje.isPresent()) {
			return optionalLenguaje.get();
		} else {
			return null;
		}
		
	}
	
	public Lenguaje createLenguaje(Lenguaje l) {
		return lenguajeRepository.save(l);
	}
	
	public Lenguaje updateLenguaje(Lenguaje leng) {
		Optional<Lenguaje> optionalLenguaje = lenguajeRepository.findById(leng.getId());
		if (optionalLenguaje.isPresent()) {
			Lenguaje lenguajeToUpdate = optionalLenguaje.get();
			lenguajeToUpdate.setName(leng.getName());
			lenguajeToUpdate.setCreator(leng.getCreator());
			lenguajeToUpdate.setCurrentVersion(leng.getCurrentVersion());
			lenguajeRepository.save(lenguajeToUpdate);
			return lenguajeToUpdate;
			
		} else {
			return null;
		}
	}
	
	public void deleteLenguaje(Long id) {
		lenguajeRepository.deleteById(id);
	}
	
}
