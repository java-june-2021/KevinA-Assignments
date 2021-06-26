package com.kevin.date.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping(value="/date", method=RequestMethod.GET)
	public String dateRequest(Model model, String date) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dayOfWeek = DateTimeFormatter.ofPattern("EEEE");
		DateTimeFormatter dayOfMonth = DateTimeFormatter.ofPattern("d");
		DateTimeFormatter month = DateTimeFormatter.ofPattern("LLLL");
		date = now.format(dayOfWeek) + ", the " + now.format(dayOfMonth) + " of " + now.format(month);
		System.out.println(dayOfWeek);
		model.addAttribute("date", date);
		return "date.jsp";
	}
	
	@RequestMapping(value="/time", method=RequestMethod.GET)
	public String timeRequest(Model model, String time) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter timeOfDay = DateTimeFormatter.ofPattern("h:mm a");
		System.out.println(timeOfDay);
		time = now.format(timeOfDay);
		model.addAttribute("time", time);
		return "time.jsp";
	}
}
