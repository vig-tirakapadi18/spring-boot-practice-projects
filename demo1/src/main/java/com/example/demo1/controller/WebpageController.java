package com.example.demo1.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebpageController {
	@GetMapping(value="/webpage")
	public String webpage() {
		return "webpage";
	}
}
