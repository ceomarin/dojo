package com.ceomarin.productocategoria.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceomarin.productocategoria.models.Category;
import com.ceomarin.productocategoria.models.Product;
import com.ceomarin.productocategoria.repositories.CategoryRepository;
import com.ceomarin.productocategoria.repositories.ProductRepository;

@Service
public class MainService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}
	
	public Product findProduct(Long id) {
		Optional<Product> optionalProduct = productRepository.findById(id);
		if (optionalProduct.isPresent()) {
			return optionalProduct.get();
		} else {
			return null;
		}
	}
	
	public Category findCategory(Long id) {
		Optional<Category> optionalCategory = categoryRepository.findById(id);
		if (optionalCategory.isPresent()) {
			return optionalCategory.get();
		} else {
			return null;
		}
	}
	
	public List<Category> listCategories() {
		return categoryRepository.findAll();
	}
	
	public List<Product> listProducts() {
		return productRepository.findAll();
	}
	
	/*
	public Product addCategoriesToProduct(Long id, List<Category> list) {
		Optional<Product> optionalProduct = productRepository.findById(id);
		if (optionalProduct.isPresent()) {
			Product productToUpdate = optionalProduct.get();
			productToUpdate.setCategories(list);
			productRepository.save(productToUpdate);
			return productToUpdate;
		} else {
			return null;
		}
	}
	*/
	
}
