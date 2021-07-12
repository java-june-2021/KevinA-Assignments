package com.kevin.dojoandninja.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kevin.dojoandninja.models.Dojo;
import com.kevin.dojoandninja.models.Ninja;
import com.kevin.dojoandninja.services.DojoService;
import com.kevin.dojoandninja.services.NinjaService;

@Controller
public class NinjaController {
	@Autowired
	private DojoService dService;
	@Autowired
	private NinjaService nService;
	
	// For New Dojo Page
	@GetMapping("/dojos/new")
	public String addNewDojo(@ModelAttribute("newDojo")Dojo dojo) {
		return "newDojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String newDojo(@Valid @ModelAttribute("newDojo")Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "newDojo.jsp";
		} else {
			dService.createDojo(dojo);
			return "redirect:/dojos/new";
		}
	}
	
	// For New Ninja Page
	@GetMapping("/ninjas/new")
	public String addNewNinja(@ModelAttribute("newNinja")Ninja ninja, Model viewModel) {
		viewModel.addAttribute("dojos", this.dService.allDojos());
		return "newNinja.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String newNinja(@Valid @ModelAttribute("newNinja")Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "newNinja.jsp";
		} else {
			nService.createNinja(ninja);
			return "redirect:/ninjas/new";
		}
	}
	
	//For Single Dojo Page
	@GetMapping("/dojos/{id}")
	public String singleDojo(@PathVariable("id") Long id, Model viewModel) {
		Dojo dojo = this.dService.getOneDojo(id);
		viewModel.addAttribute("dojo", dojo);
		viewModel.addAttribute("ninjas", this.nService.ninjasByDojo(dojo));
		return "showDojo.jsp";
	}
	
}
