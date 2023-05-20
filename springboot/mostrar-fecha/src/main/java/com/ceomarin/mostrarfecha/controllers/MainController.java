package com.ceomarin.mostrarfecha.controllers;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.stereotype.Controller;
//import java.util.Locale;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }

	@RequestMapping("/date")
	public String date(Model model) {
		try {

		Date fecha = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("EEEE, dd 'de' MMMM, yyyy");		
		model.addAttribute("fecha",formato.format(fecha));
		
		}catch(Exception e) {
			System.out.println("Error "+e);
		}
		
		return "date.jsp";


	}

	@RequestMapping("/time")
	public String time(Model model) {
		try {

			 LocalDateTime hora = LocalDateTime.now();
			 DateTimeFormatter miFormatoHora = DateTimeFormatter.ofPattern("HH:mm a ");
			 String formatoHora = hora.format(miFormatoHora);
			 model.addAttribute("hora",formatoHora.toUpperCase());
		
		}catch(Exception e) {
			System.out.println("Error "+e);
		}
		return "time.jsp";
	}

}
