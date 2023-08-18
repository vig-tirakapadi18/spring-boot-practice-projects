package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {
//	@GetMapping(value="/hi")	//@RestController
//	public String hi() {
//		return "Hi Spring Boot!";
//	}
	
	@GetMapping(value="/test")
	public String test() {
		return "test";
	}
}
