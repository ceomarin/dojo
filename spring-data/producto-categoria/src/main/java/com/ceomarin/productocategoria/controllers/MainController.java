package com.ceomarin.productocategoria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ceomarin.productocategoria.models.Category;
import com.ceomarin.productocategoria.models.Product;
import com.ceomarin.productocategoria.services.MainService;

import jakarta.validation.Valid;

@Controller
public class MainController {

	@Autowired
	private MainService mainService;

	//Product
	@GetMapping("/products/new")
	public String newProduct(@ModelAttribute("product")Product product) {
		return "/products/newProduct";
	}
	
	@PostMapping("/products/new")
	public String newProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "/products/newProduct";
		}
		mainService.createProduct(product);
		return "redirect:/products/new";
	}
	//Show
	@GetMapping("/products/{id}")
	public String showProducts(@PathVariable("id") Long id,@Valid @ModelAttribute("product") Product producto, BindingResult result,Model viewModel ) {
		producto= mainService.findProduct(id);
		List<Category> categorias = mainService.listCategories();
		viewModel.addAttribute("producto", producto);
		viewModel.addAttribute("categorias", categorias);
		
		return "/products/showProducts";
	}
	
	
	//Category
	@GetMapping("/categories/new")
	public String newCategory(@ModelAttribute("category") Category category) {
		return "/categories/newCategory";
	}
	
	@PostMapping("/categories/new")
	public String newCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "/categories/newCategory";
		}
		mainService.createCategory(category);
		return "redirect:/categories/new";
	}
	
	@GetMapping("/categories/{id}")
	public String showCategory(@PathVariable("id") Long id,@Valid @ModelAttribute("category") Category categoria, BindingResult result,Model viewModel ) {
		categoria= mainService.findCategory(id);
		List<Product> productos = mainService.listProducts();
		System.out.println(productos);
		viewModel.addAttribute("productos", productos);
		viewModel.addAttribute("categoria", categoria);
		
		return "/categories/showCategory";
	}
	
}
