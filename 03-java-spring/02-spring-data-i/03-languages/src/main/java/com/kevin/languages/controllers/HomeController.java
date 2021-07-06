package com.kevin.languages.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kevin.languages.models.Language;
import com.kevin.languages.services.LanguageService;

@Controller
@RequestMapping("/languages")
public class HomeController {
	@Autowired
	private LanguageService lService;
	
	@GetMapping("")
	public String index(@ModelAttribute("language") Language language, Model viewModel) {
		viewModel.addAttribute("allLanguages", this.lService.allLanguages());
		return "/languages/index.jsp";
	}
		
	@PostMapping("")
	public String createLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "/languages/index.jsp";
		}
		this.lService.createLanguage(language);
		return "redirect:/languages";
	}
	
	@GetMapping("/{id}/edit")
	public String editLanguage(@Valid @PathVariable("id")Long id, Model model) {
		if(lService.getOneLanguage(id) != null) {
			model.addAttribute("languageFind", lService.getOneLanguage(id));
			return "/languages/edit.jsp";
		} else {
			return "redirect:/languages";
		}
	}
	
	@PostMapping("/{id}/edit")
	public String updateLanguage(@Valid @PathVariable("id") Long id, @ModelAttribute("LanguageFind") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "/languages/edit.jsp";
		} else {
			lService.updateLanguage(id, language);
			return "redirect:/languages";
		}	
	}
	
	@GetMapping("/{id}/delete")
	public String deleteLanguage(@PathVariable("id") Long id) {
		if(lService.getOneLanguage(id) != null) {
			lService.deleteLanguage(id);
		}
		return "redirect:/languages";
	}
	
	@GetMapping("/{id}")
	public String getOneLanguage(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("oneLanguage", this.lService.getOneLanguage(id));
		return "/languages/singleview.jsp";
	}
	
	@PutMapping("/{id}")
	public void updateLanguage(@PathVariable("id") Long id, Language language) {
		this.lService.updateLanguage(id, language);
	}
	
	@PostMapping("/{id}")
	public void deleteLanguagePost(@PathVariable("id") Long id) {
		this.lService.deleteLanguage(id);
	}
	
	
}
