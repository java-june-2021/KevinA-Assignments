package com.kevin.hello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(@RequestParam(value="name", required=false) String nameQuery, Model model) {
		if(nameQuery == null) {
			model.addAttribute("firstName", "Human");
		} else {
		model.addAttribute("firstName", nameQuery);
		}
		return "index.jsp";
	}
}
