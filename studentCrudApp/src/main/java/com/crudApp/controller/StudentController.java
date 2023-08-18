package com.crudApp.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.crudApp.entities.Student;
import com.crudApp.services.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping("/create")
	public String create(@RequestBody Student s) {
		return service.addStudent(s);
	}
	
	@GetMapping("/fetch/{kodId}")
	public Student fetch(@PathVariable String kodId) {
		return service.fetchStudent(kodId);
	}
	
	@PutMapping("/update")
	public String update(@RequestBody Student s) {
		return service.updateStudent(s);
	}
	
	@DeleteMapping("/delete/{kodId}")
	public String delete(@PathVariable String kodId) {
		return service.deleteStudent(kodId);
	}
}
