package com.ceomarin.lookify.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ceomarin.lookify.models.Song;
import com.ceomarin.lookify.services.SongService;

import jakarta.validation.Valid;

@Controller
public class MainController {
	
	@Autowired
	private SongService servicio;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model viewModel) {	
		List<Song> canciones = servicio.canciones();
		viewModel.addAttribute("canciones",canciones);
		return "dashboard";
	}
	
	@GetMapping("/top")
	public String top(Model viewModel) {
		List<Song> canciones = servicio.cancionesOrderBy();
		viewModel.addAttribute("canciones", canciones);
		return "top";
	}
	
	@GetMapping("/songs/new")
	public String newSong(@ModelAttribute("song") Song song) {
		return "add";
	}
	
	@PostMapping("/songs/new")
	public String newSongPost(@Valid @ModelAttribute("song")Song song,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "add";
		}
		servicio.create(song);
		return "redirect:/";
	}
	
	@GetMapping("/songs/{id}")
	public String detalle(@PathVariable("id")Long id,Model viewModel) {
		Song song = servicio.cancion(id);			
		viewModel.addAttribute("song",song);
		
		return "detail";
	}

	@GetMapping("/songs/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		servicio.delete(id);
		return "redirect:/";
	}
}
