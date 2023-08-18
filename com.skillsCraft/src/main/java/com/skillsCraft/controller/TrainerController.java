package com.skillsCraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.skillsCraft.entities.Course;
import com.skillsCraft.entities.Lesson;
import com.skillsCraft.services.TrainerService;

@Controller
public class TrainerController {
	@Autowired
	TrainerService tService;
	
	@PostMapping("/addCourse")
	public String addCourse(@ModelAttribute Course course) {
		tService.addCourse(course);
		return "addCourse";
	}
	
	@GetMapping("/viewCourses")
	public String viewCourses(Model model) {
		List<Course> cList = tService.fetchAllCourses();
		model.addAttribute("cList",cList);
		return "courses";
	}
	
	@PostMapping("/addLesson")
	public String addLesson(@ModelAttribute Lesson lesson) {
		tService.addLesson(lesson);
		Course course = lesson.getCourse();
		course.getlList().add(lesson);
		tService.saveCourse(course);
		return "trainerHome";
	}
}
