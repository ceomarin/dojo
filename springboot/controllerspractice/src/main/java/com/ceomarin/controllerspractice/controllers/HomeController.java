/**
 * 
 */
package com.ceomarin.controllerspractice.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cemar
 *
 */

@RestController
public class HomeController {
    @RequestMapping("/greeting")
    public String index(){
      return "Hello user!";
    }
    @RequestMapping("/")
    public String index(@RequestParam(value="q",required=false) String searchQuery) {
        return "Ha buscado:  " + searchQuery;
    }
    
    //También puede ser explícito acerca de las solicitudes.
    @RequestMapping(value="/greeting/hello", method=RequestMethod.GET)
    public String hello(){
      return "Hello world! ¿Que ruta utilizaste para acceder aqui?";
    }
    @RequestMapping("/greeting/goodbye")
    public String world(){
      return "Goodbye world!";
    }
    @RequestMapping("/m/{track}/{module}/{lesson}")
    public String showLesson(@PathVariable("track") String track, @PathVariable("module") String module, @PathVariable("lesson") String lesson){
    	return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
    }
}
