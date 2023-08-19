package com.skillsCraft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skillsCraft.entities.Course;
import com.skillsCraft.entities.Lesson;
import com.skillsCraft.entities.Users;
import com.skillsCraft.services.StudentService;
import com.skillsCraft.services.UsersService;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController {
	@Autowired
	StudentService sService;
	
	@Autowired
	UsersService uService;
	
	@GetMapping("/purchaseCourse")
	public String purchase(Model model) {
		List<Course> cList = sService.fetchAllCourses();
		model.addAttribute("cList" ,cList);
		return "purchaseCourse";
	}
	
	@GetMapping("/myCourses")
	public String myCourses(Model model, HttpSession session) {
		Users loggedUser = (Users) session.getAttribute("loggedInUser");
		String email = loggedUser.getEmail();
		Users user = uService.findUserByEmail(email);
		
		List<Course> cList = user.getcList();
		model.addAttribute("cList", cList);
		return "myCourses";
	}
	
	@GetMapping("/viewLesson")
	public String viewLesson(@RequestParam("lId") int lId, 
											Model model, 
											HttpSession session) {
		Lesson lesson = sService.getLesson(lId);
		
		String youtubeUrl = lesson.getlLink();
		
		String videoId = youtubeUrl.substring(youtubeUrl.indexOf("=") + 1);
		lesson.setlLink(videoId);
		
		model.addAttribute("lesson", lesson);
		
		return "myLesson";
	}
}
