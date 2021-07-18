package com.kevin.products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kevin.products.models.Category;
import com.kevin.products.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);
}
