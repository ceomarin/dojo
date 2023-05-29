package com.ceomarin.ninjagold.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller

public class MainController {
	ArrayList<String> actividades = new ArrayList<String>();
	SimpleDateFormat fmtFecha = new SimpleDateFormat("MMMM d yyyy h:mm a");
	

	@RequestMapping("/gold")
	public String index(HttpSession session) {
		int gold = 0;
		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", gold);
			session.setAttribute("actividades", actividades);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		actividades.clear();
		session.setAttribute("gold", 0);
		session.setAttribute("actividades", actividades);
		return "redirect:/gold";
	}
	
	
	@RequestMapping(value="/gold", method = RequestMethod.POST)
	public String gold(HttpSession session,@RequestParam(value="find")String find) {
		Integer aux = 0;
		int gold = 0, 
			addRandom = 0;
		String auxString ="";
		Random aleatorio = new Random();
		
		switch (find) {
		case "farm":
			aux = (Integer)session.getAttribute("gold");
			addRandom = aleatorio.nextInt(10, 21);
			gold = (aux.intValue()) + addRandom;
			auxString = "You entered a farm and earned "+addRandom+" gold ("+fmtFecha.format(new Date())+")";
			session.setAttribute("gold", gold);
			actividades.add(auxString);
			
			break;
		
		case "cave":
			aux = (Integer)session.getAttribute("gold");
			addRandom = aleatorio.nextInt(5, 11);
			gold = (aux.intValue()) + addRandom;
			auxString = "You entered a cave and earned "+addRandom+" gold ("+fmtFecha.format(new Date())+")";
			session.setAttribute("gold", gold);
			actividades.add(auxString);
			break;
			
		case "house":
			aux = (Integer)session.getAttribute("gold");
			addRandom = aleatorio.nextInt(2, 6);
			gold = (aux.intValue()) + addRandom;
			auxString = "You entered a house and earned "+addRandom+" gold ("+fmtFecha.format(new Date())+")";
			session.setAttribute("gold", gold);
			actividades.add(auxString);
			break;
			
		case "casino":
			aux = (Integer)session.getAttribute("gold");
			addRandom = aleatorio.nextInt(-50, 51);
			gold = (aux.intValue()) + addRandom;

			if (addRandom < 0 ) {
				auxString = "You entered a casino and lost "+addRandom+" gold ("+fmtFecha.format(new Date())+")";				
			} else {				
				auxString = "You entered a casino and earned "+addRandom+" gold ("+fmtFecha.format(new Date())+")";
			}
			session.setAttribute("gold", gold);
			actividades.add(auxString);
			break;
			
		default:
			break;
		}
		
		return "index.jsp";
	}
}
