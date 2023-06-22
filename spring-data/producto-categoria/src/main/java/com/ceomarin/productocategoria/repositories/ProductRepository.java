package com.ceomarin.productocategoria.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ceomarin.productocategoria.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {

	public List<Product> findAll();
	
	public Optional<Product> findById(Long id);
}
