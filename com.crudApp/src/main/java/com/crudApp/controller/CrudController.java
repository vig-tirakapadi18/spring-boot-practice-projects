package com.crudApp.controller;

import org.springframework.web.bind.annotation.*;

import com.crudApp.entities.Student;

@RestController
@RequestMapping("/crud")
public class CrudController {
	@PostMapping("/create")
	public String create(@RequestBody Student s) {
		System.out.println(s);
		return "Create Page!";
	}
	
	@GetMapping("/read/{kodId}")
	public Student read(@PathVariable String kodId) {
		Student s1 = new Student("KOD101", "Vighnesh", "FEB");
		Student s2 = new Student("KOD102", "Vishu", "JUL");
		if(kodId.equals("KOD101")) {
			return s1;
		} else if (kodId.equals("KOD102")) {
			return s2;
		}
		return null;
	}
	
	@PutMapping("/update")
	public String update() {
		return "Update Page!";
	}
	
	@DeleteMapping("/delete")
	public String delete() {
		return "Delete Page!";
	}
}
