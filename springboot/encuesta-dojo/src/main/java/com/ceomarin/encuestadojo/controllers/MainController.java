package com.ceomarin.encuestadojo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/result",method = RequestMethod.POST)
	public String result(@RequestParam(value="name") String name,@RequestParam(value="dojo") String dojo, @RequestParam(value="language") String language,@RequestParam(value="comment") String comment,Model model) {
		System.out.println(name);
		model.addAttribute("name", name);
		model.addAttribute("dojo", dojo);
		model.addAttribute("language", language);
		model.addAttribute("comment", comment);
		return "result.jsp";
	}
	
//	@RequestMapping("/result")
//	public String result() {
//		System.out.println("nombre");
//		return "result.jsp";
//	}
}
