package ait.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ait.com.model.Student;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String loadHomePage(Model model) {
		Student student = new Student();
		model.addAttribute("stu", student);
		
		return "home";
	}
	
	@PostMapping("/save")
	public String saveStudent(@ModelAttribute("stu") Student student, Model model) {
		System.out.println(student.getSid());
		System.out.println(student.getSname());
		System.out.println(student.getScourse());
		
		model.addAttribute("sucMsg", "Success !");
		return "home";
	}
	
	@GetMapping("/edit")
	public String editStudent() {
		Student student = new Student();
		student.setSid(101);
		student.setSname("Smit");
		student.setScourse("Spring Boot");
		return "stuEdit";
	}
	
	
	
}
