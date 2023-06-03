package com.ceomarin.licencias.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ceomarin.licencias.models.License;
import com.ceomarin.licencias.models.Person;
import com.ceomarin.licencias.services.MainService;

import jakarta.validation.Valid;

@Controller
public class MainController {

	@Autowired
	private MainService servicio;
	
	@GetMapping("/persons/new")
	public String index(@ModelAttribute("person") Person person) {
		return "/person/new";
	}

    @PostMapping("/persons/new")
    public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
        if (result.hasErrors()) {
            return "/person/new";
        } else {
            servicio.createPerson(person);
            return "redirect:/persons/new";
        }
    }
    
	@GetMapping("/persons/{id}")
	public String mostrarUser(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("person",servicio.findPerson(id));
		return "/person/show";
	}
	
	@GetMapping("/licenses/new")
	public String indexLicense(@ModelAttribute("license")License license,Model model) {
		List<Person> personas = servicio.findAllPersonsLicenseNull();
		model.addAttribute("personas", personas);
		return "/license/new";
	}
	@PostMapping("/licenses/new")
	public String createLicense(@Valid @ModelAttribute("license")License license,BindingResult result,Model model) {
		if (result.hasErrors()) {
			List<Person> personas = servicio.findAllPersonsLicenseNull();
			model.addAttribute("personas", personas);
			System.out.println("ERORRRRRRR");
			return "/license/new";
        } else {
        	
            servicio.createLicense(license);
            return "redirect:/licenses/new";
        }
	}
}
