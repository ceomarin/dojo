package com.ceomarin.lenguajes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.ceomarin.lenguajes.models.Lenguaje;
import com.ceomarin.lenguajes.services.LenguajeService;

import jakarta.validation.Valid;

@Controller
public class LenguajeControllers {
	
	
	@Autowired
	private LenguajeService servicio;

	@GetMapping("/languages")
	public String showAll(@ModelAttribute("lenguaje") Lenguaje lenguaje,Model viewModel) {
		List<Lenguaje> languages = servicio.allLenguajes();
		viewModel.addAttribute("languages", languages);
		return "/languages/index";
	}
	
	@PostMapping("/languages")
    public String create(@Valid @ModelAttribute("lenguaje") Lenguaje lenguaje, BindingResult result,Model viewModel) {
		List<Lenguaje> languages = servicio.allLenguajes();
		System.out.println(languages);
		viewModel.addAttribute("languages", languages);
		
		if (result.hasErrors()) {
        	
            return "/languages/index";
        } else {
            servicio.createLenguaje(lenguaje);
            return "redirect:/languages";
        }
    }
	
	@GetMapping("/languages/{id}")
	public String showOne(@PathVariable("id") Long id,Model viewModel) {
		Lenguaje language = servicio.findLenguaje(id);
		viewModel.addAttribute("language", language);
		return "/languages/show";
	}
	
	@PutMapping("/languages/{id}/edit")
	public String update(@Valid @ModelAttribute("lenguaje") Lenguaje lenguaje, BindingResult result,@PathVariable("id") Long id,Model viewModel) {
		Lenguaje language = servicio.findLenguaje(id);
		viewModel.addAttribute("language", language);
		if (result.hasErrors()) {
            return "/languages/edit";
        } else {
            servicio.updateLenguaje(lenguaje);
            return "redirect:/languages";
        }
		
	}
	
	@DeleteMapping("/languages/{id}")
	public String deleteLanguages(@PathVariable("id") Long id) {
		servicio.deleteLenguaje(id);
		return "redirect:/languages";
	};
	
   
}
