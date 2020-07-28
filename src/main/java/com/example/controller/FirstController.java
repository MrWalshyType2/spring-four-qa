package com.example.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {

	@GetMapping()
	public String message1() {
		return "Received a GET request";
	}
	
	@PostMapping()
	public String message2() {
		return "Received a POST request";
	}
	
	@DeleteMapping
	public String message3() {
		return "Received a DELETE request";
	}
}
