package com.kevin.products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.products.models.Category;
import com.kevin.products.models.Product;
import com.kevin.products.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pRepo;
	
	public List<Product> allProducts(){
		return this.pRepo.findAll();
	}
	
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	
	public Product getSingleProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public List<Product> findProdNotCat(Category category) {
		return this.pRepo.findByCategoriesNotContains(category);
	}
	
	public void addCategoryToProduct(Category category, Product product) {
		List<Category> existingCats = product.getCategories();
		existingCats.add(category);
		this.pRepo.save(product);
	}
}
