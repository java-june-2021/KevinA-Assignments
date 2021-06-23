package com.kevin.routing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	@RequestMapping("")
	public String dojoGreeting() {
		return "The Dojo is awesome!";
	}
	
	@RequestMapping(value="/{location}")
	public String dojoLocation(@PathVariable ("location") String location) {
		if (location.equals("burbank")) {
			return "Brubank Dojo is located in Southern California";
		}
		if (location.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		}
		return location;
	}
	
}
