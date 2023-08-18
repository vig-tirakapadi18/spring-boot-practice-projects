package com.crudApp.services;

import com.crudApp.entities.Student;

public interface StudentService {
	String addStudent(Student s);
	Student fetchStudent(String kodId);
	String updateStudent(Student s);
	String deleteStudent(String kodId);
}
