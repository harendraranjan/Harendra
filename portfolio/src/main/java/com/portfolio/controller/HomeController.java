package com.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.portfolio.Dao.UserReposetry;
import com.portfolio.entity.contact;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@Autowired
	private UserReposetry userRepository;
	
	@GetMapping("/")
	public String Home() {
		return "index";
	}
	
	@GetMapping("/about")
	public String About() {
		return "about";
	}
	
	@GetMapping("/service")
	public String Service() {
		return "service";
	}
	@GetMapping("/project")
	public String Projecr() {
		return "project";
	}

	@GetMapping("/contact")
	public String Contact() {
		return "contact";
	}
	
	// save contact form
	@PostMapping("/saveUser")
	public String SaveUser(@ModelAttribute contact Contact, HttpSession session,Model m) {
		this.userRepository.save(Contact);
		return"redirect:/contact";
	}
}
