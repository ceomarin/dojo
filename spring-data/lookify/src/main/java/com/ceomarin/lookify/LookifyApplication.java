package com.ceomarin.lookify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class LookifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(LookifyApplication.class, args);
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/dashboard/")
	public String dashboard() {
		return "dashboard";
	}


}
