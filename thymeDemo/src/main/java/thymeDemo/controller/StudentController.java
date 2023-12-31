package thymeDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import thymeDemo.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping("/fun")
	public String fun(Model model) {
		model.addAttribute("name", "Vighnesh");
		
		Student s = new Student("KOD111", "Vighnesh", "FEB23");
		
		model.addAttribute("s", s);
		
		Student st1 = new Student("KOD555", "Alpha", "MAR");
		Student st2 = new Student("KOD666", "Beta", "APR");
		Student st3 = new Student("KOD777", "Gamma", "MAY");
		Student st4 = new Student("KOD888", "Delta", "JUN");
		
		List<Student> sList = new ArrayList<Student>();
		sList.add(st1);
		sList.add(st2);
		sList.add(st3);
		sList.add(st4);
		
		model.addAttribute("sList", sList);
		
		return "student";
	}
}
