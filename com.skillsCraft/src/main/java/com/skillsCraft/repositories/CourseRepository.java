package com.skillsCraft.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillsCraft.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
	Course findBycId(int cId);
}
