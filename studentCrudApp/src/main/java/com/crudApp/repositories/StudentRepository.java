package com.crudApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudApp.entities.Student;

public interface StudentRepository extends JpaRepository<Student, String> {
	Student findByKodId(String kodId);
}
