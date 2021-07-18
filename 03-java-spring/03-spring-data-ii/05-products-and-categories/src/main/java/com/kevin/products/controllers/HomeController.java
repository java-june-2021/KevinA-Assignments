package com.kevin.products.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kevin.products.models.Product;
import com.kevin.products.services.CategoryService;
import com.kevin.products.services.ProductService;

@Controller
public class HomeController {
	@Autowired
	private CategoryService cServ;
	@Autowired 
	private ProductService pServ;
	
	@GetMapping("/products/new")
	public String newProd() {
		return "newProduct.jsp";
	}
	
	@GetMapping("/categories/new")
	public String newCat() {
		return "newCategory.jsp";
	}
	
	@PostMapping("/newProd")
	public String makeProd(@RequestParam("name") String name, @RequestParam("desc") String desc, @RequestParam("price") float price) {
		Product newProd = new Product(name, desc, price);
		this.pServ.createProduct(newProd);
		return "redirect:/products/new";
	}
	
	
	
}
