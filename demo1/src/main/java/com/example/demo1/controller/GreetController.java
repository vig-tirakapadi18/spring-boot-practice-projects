package com.example.demo1.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetController {
	@GetMapping(value="/morning")
	public String morning() {
		return "Good Morning!";
	}
	
	@GetMapping(value="/afternoon")
	public String afternoon() {
			return "Good Afternoon!";
	}
	
	@GetMapping(value="/night")
	public String night() {
		return "Good Night!";
	}
}
