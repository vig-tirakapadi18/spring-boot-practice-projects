package com.crudApp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudApp.entities.Student;
import com.crudApp.repositories.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {
	@Autowired
	StudentRepository repo;
	
	public String addStudent(Student s) {
		repo.save(s);
		return "Student Added!";
	}
	
	public Student fetchStudent(String kodId) {
		return repo.findByKodId(kodId);
	}
	
	public String updateStudent(Student s) {
		repo.save(s);
		return "Student Updated!";
	}
	
	public String deleteStudent(String kodId) {
		repo.deleteById(kodId);
		return "Student Deleted!";
	}
}
