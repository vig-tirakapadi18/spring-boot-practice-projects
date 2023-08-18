package studentCrudApp2.services;

import java.util.List;

import studentCrudApp2.entities.Student;

public interface StudentService {
	String addStudent(Student s);
	Student fetchStudent(String kodId);
	String updateStudent(Student s);
	String deleteStudent(String kodId);
	
	List<Student> fetchAllStudents();
}
