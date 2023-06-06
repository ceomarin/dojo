package com.ceomarin.dojosninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ceomarin.dojosninjas.models.Dojo;
import com.ceomarin.dojosninjas.models.Ninja;
import com.ceomarin.dojosninjas.services.MainService;

import jakarta.validation.Valid;

@Controller
public class MainController {

	@Autowired
	private MainService mainService;
	
	@GetMapping("/dojos/new")
	public String viewNewDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "/dojos/newDojo";
	}
	
    @PostMapping("/dojos/new")
    public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
            return "/dojos/newDojo";
        } else {
            mainService.createDojo(dojo);
            return "redirect:/dojos/new";
        }
    }
    
	@GetMapping("/dojos/{id}")
	public String showTableDojo(@PathVariable("id") Long id, Model viewModel) {
		Dojo n = mainService.findDojoById(id);
		System.out.println(n);
		viewModel.addAttribute("dojo", mainService.findDojoById(id) );
		return "/dojos/showDojos";
	}
    
	@GetMapping("/ninjas/new")
	public String viewNewNinja(@ModelAttribute("ninja") Ninja ninja, Model viewModel) {
		viewModel.addAttribute("dojos", mainService.findDojoAll());
		return "/ninjas/newNinja";
	}
	
    @PostMapping("/ninjas/new")
    public String createDojo(@Valid @ModelAttribute("ninja") Ninja ninjaForm, BindingResult result,@ModelAttribute("dojo") Dojo dojoForm,Model viewModel) {
        if (result.hasErrors()) {
        	viewModel.addAttribute("dojos", mainService.findDojoAll());
            return "/ninjas/newNinja";
        } else {
        	var dojo = mainService.findDojoById(dojoForm.getId());
        	Ninja ninja = new Ninja(ninjaForm.getFirstName(),ninjaForm.getLastName(),ninjaForm.getAge(),dojo);
            mainService.createNinja(ninja);
            return "redirect:/ninjas/new";
        }
    }
	
}
