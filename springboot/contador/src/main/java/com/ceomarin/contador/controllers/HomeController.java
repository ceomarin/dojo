package com.ceomarin.contador.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/your_server")
public class HomeController {
		int count;

    @RequestMapping("")
    public String index(HttpSession session) {
    	if(session.getAttribute("count")==null) {
    		count = 1;
    		session.setAttribute("count", count);
    		System.out.println("count new : "+count);
    	}else {
    		try {
        		Integer aux = (Integer) session.getAttribute("count");
        		count = (aux.intValue()) + 1;
        		session.setAttribute("count", count);
        		System.out.println("count: "+count);
        		
    		}catch (Exception e) {
    			System.out.println("Error: "+e);
    		}

    	}
    	
        return "index.jsp";
    }
    
	@RequestMapping("/counter")
    public String counter(Model model) {
    	model.addAttribute("contador", count);
        return "counter.jsp";
    }	
    
    @RequestMapping("/other")
    public String other(HttpSession session) {
    	if(session.getAttribute("count")==null) {
    		count = 2;
    		session.setAttribute("count", count);
    		System.out.println("count new : "+count);
    	}else {
    		try {
        		Integer aux = (Integer) session.getAttribute("count");
        		count = (aux.intValue()) + 2;
        		session.setAttribute("count", count);
        		System.out.println("count: "+count);
        		
    		}catch (Exception e) {
    			System.out.println("Error: "+e);
    		}

    	}
    	
        return "other.jsp";
    }
        
	@RequestMapping("/reset")
    public String resetCounter(HttpSession session) {
		count = 0;
		session.setAttribute("count",0);
		System.out.println(session.getAttribute("count"));
		return "redirect:/your_server/counter";
	}
	

}
