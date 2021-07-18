package com.kevin.products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.products.models.Category;
import com.kevin.products.models.Product;
import com.kevin.products.repositories.CategoryRepository;

@Service
public class CategoryService  {
	@Autowired
	private CategoryRepository cRepo;
	
	public List<Category> allCategories(){
		return this.cRepo.findAll();
	}
	
	public Category createCategory(Category cat) {
		return this.cRepo.save(cat);
	}
	
	public Category getSingleCat(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	public List<Category> findCatNotProd(Product product) {
		return this.cRepo.findByProductsNotContains(product);
	}
	
	public void addProductToCategory(Product product, Category category) {
		List<Product> existingProducts = category.getProducts();
		existingProducts.add(product);
		this.cRepo.save(category);
	}
}
