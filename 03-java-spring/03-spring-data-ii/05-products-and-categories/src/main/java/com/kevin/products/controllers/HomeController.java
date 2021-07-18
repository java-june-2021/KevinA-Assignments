package com.kevin.products.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kevin.products.models.Category;
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
	
	@PostMapping("/newCat")
	public String makeCat(@RequestParam("name")String name) {
		Category newCat = new Category(name);
		this.cServ.createCategory(newCat);
		return "redirect:/categories/new";
	}
	
	@GetMapping("/products/{id}")
	public String showProd(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("product", this.pServ.getSingleProduct(id));
		viewModel.addAttribute("category", this.cServ.findCatNotProd(this.pServ.getSingleProduct(id)));
		return "showProduct.jsp";
	}
	
	@GetMapping("/categories/{id}")
	public String showCat(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("category", this.cServ.getSingleCat(id));
		viewModel.addAttribute("product", this.pServ.findProdNotCat(this.cServ.getSingleCat(id)));
		return "showCategory.jsp";
	}
	
	@PostMapping("/products/{id}")
	public String addCategoryToProduct(@RequestParam("showCat") Long catId, @PathVariable("id") Long id) {
		Product product = this.pServ.getSingleProduct(id);
		Category category = this.cServ.getSingleCat(catId);
		this.pServ.addCategoryToProduct(category, product);
		return "redirect:/products/{id}";
	}
	
	
	@PostMapping("/categories/{id}")
	public String addProductToCategory(@RequestParam("showPro") Long prodId, @PathVariable("id") Long id) {
		Category category = this.cServ.getSingleCat(id);
		Product product = this.pServ.getSingleProduct(prodId);
		this.cServ.addProductToCategory(product, category);
		return "redirect:/categories/{id}";
	}
}
