package com.skillsCraft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillsCraft.entities.Course;
import com.skillsCraft.entities.Lesson;
import com.skillsCraft.repositories.CourseRepository;
import com.skillsCraft.repositories.LessonRepository;

@Service
public class StudentServiceImplementation implements StudentService {
	@Autowired
	CourseRepository cRepo;
	
	@Autowired
	LessonRepository lRepo;
	
	public List<Course> fetchAllCourses() {
		return cRepo.findAll();
	}

	public Course fetchCourse(int cId) {
		return cRepo.findBycId(cId);
	}

	public Lesson getLesson(int lId) {
		return lRepo.findBylId(lId);
	}
}
