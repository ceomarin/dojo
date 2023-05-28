package com.ceomarin.holahumano.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index(@RequestParam(value="name",required = false) String firstName,@RequestParam(value="lastName",required = false) String lastName, Model model) {
		model.addAttribute("name", firstName);
		model.addAttribute("apellido", lastName);
		return "index.jsp";	
	}
}
