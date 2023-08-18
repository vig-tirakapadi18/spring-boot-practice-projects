package studentCrudApp2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import studentCrudApp2.entities.Student;
import studentCrudApp2.services.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService service;
	
//	@PostMapping("/create")
//	public String create(Student s) {
//		return service.addStudent(s);
//	}
	
//	@PostMapping("/create")
//	public String create(@RequestParam("kodId") String kodId, 
//									@RequestParam("name") String name,
//									@RequestParam("batch") String batch) {
//		Student s = new Student(kodId, name, batch);
//		service.addStudent(s);
//		return "test";
//	}
	
	@PostMapping("/create")
	public String create(@ModelAttribute Student s) {
		service.addStudent(s);
		return "index";
	}
	
	@GetMapping("/fetch")
	public String fetch(@RequestParam("kodId") String kodId, Model m) {
		Student s = service.fetchStudent(kodId);
		m.addAttribute("s", s);
		return "showStudent";
	}
	
	@GetMapping("/fetchAllStudents")
	public String fetchAll(Model m) {
		List<Student> sList = service.fetchAllStudents();
		m.addAttribute("sList", sList);
		return "showAllStudents";
	}
	
//	@PutMapping("/update")
//	public String update(@RequestParam("kodId") String kodId,
//									@RequestParam("name") String name,
//									@RequestParam("batch") String batch) {
//		Student s = new Student(kodId, name, batch);
//		return service.updateStudent(s);
//	}
	
	@PutMapping("/update")
	public String update(@ModelAttribute Student s) {
		service.updateStudent(s);
		return "index";
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam("kodId") String kodId) {
		service.deleteStudent(kodId);
		return "index";
	}
}
