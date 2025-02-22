package ait.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

	
	@GetMapping("/search")
	public String searchStuByName(Model model) {
		
		
		model.addAttribute("uName", "Adam");
		return "searchStu";
	}
}
