package com.service.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
	@GetMapping("/display")
	public String display() {
		return "<h1>Hi</h1>";
	}
	@GetMapping("/print")
	public String print() {
		return "<h1>Hello</h1>";
	}
	
	@GetMapping("/tacos")
	public String tacos() {
		return "<h1>Tacos</h1>";
	}

}
