package com.simplilean.webservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String indexMapping() {
		return "<h1> Welcome Spring security </h1>";
	}
	
	@GetMapping("/user")
	public String userMapping() {
		return "<h1> Welcome Spring security - USER </h1>";
	}
	
	
	@GetMapping("/admin")
	public String adminMapping() {
		return "<h1> Welcome Spring security - ADMIN </h1>";
	}
}
