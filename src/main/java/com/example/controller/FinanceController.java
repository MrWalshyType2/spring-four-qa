package com.example.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/finance")
public class FinanceController {

	@GetMapping()
	public String message1() {
		return "You sent a GET request, reponse success";
	}
	
	@PostMapping()
	public String message2() {
		return "You sent a POST request, response success";
	}
	
	@DeleteMapping()
	public String message3() {
		return "You sent a DELETE request, response success";
	}
}
