package com.skillsCraft.services;

import java.util.List;

import com.skillsCraft.entities.*;

public interface StudentService {
	List<Course> fetchAllCourses();
	Course fetchCourse(int cId);
	Lesson getLesson(int lId);
}
