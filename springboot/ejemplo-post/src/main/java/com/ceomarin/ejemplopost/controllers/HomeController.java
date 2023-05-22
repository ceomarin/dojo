package com.ceomarin.ejemplopost.controllers;


import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	String nombre;
	String pass;
	
	@RequestMapping("/")
    public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(@RequestParam(value="username") String username, @RequestParam(value="password") String password) {
		 nombre = username;
		 pass = password;
		return "redirect:/dashboard";
	}
	 @RequestMapping("/dashboard")
	    public String dashboard(Model model) {
		 	HashMap<String, String> data = new HashMap<String, String>();
		 	data.put("clave", pass);
		 	data.put("nombre", nombre);
			model.addAttribute("data",data);
			System.out.println(data);
	      return "dashboard.jsp";
	    }
	 
	 @RequestMapping("/createError")
		public String flashMessages(RedirectAttributes redirectAttributes) {
	        redirectAttributes.addFlashAttribute("error", "A test errror!");
	        return "redirect:/";
		}
}
