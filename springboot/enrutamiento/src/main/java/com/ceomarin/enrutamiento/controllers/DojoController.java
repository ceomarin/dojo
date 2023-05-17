package com.ceomarin.enrutamiento.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("dojo/{track}")
	public String dojo(@PathVariable("track") String track) {
		return "¡El "+track+" es increíble!";
	}
	@RequestMapping("burbank-dojo")
	public String burbank() {
		return "El Dojo Burbank está localizado al sur de California";
	}
	@RequestMapping("san-jose")
	public String jose() {
		return  "El Dojo SJ es el cuartel general";
	}
}
