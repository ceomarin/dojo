package com.ceomarin.productocategoria.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ceomarin.productocategoria.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Long>{

	public List<Category> findAll();
	public Optional<Category> findById(Long id);
}
