package com.kevin.survey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/result")
	public String result(@RequestParam("name") String name, @RequestParam("location") String location, @RequestParam("language") String language, @RequestParam("comment") String comment, Model viewModel) {
		viewModel.addAttribute("nameForResult", name);
		viewModel.addAttribute("locationForResult", location);
		viewModel.addAttribute("languageForResult", language);
		viewModel.addAttribute("commentForResult", comment);
		if(language.equals("Java")) {
			return "redirect:/java";
		} else {
		return "result.jsp";
	}
	}
	
	@GetMapping("/java")
	public String java() {
		return "java.jsp";
	}
}
