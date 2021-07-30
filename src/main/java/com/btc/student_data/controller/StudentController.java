package com.btc.student_data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.btc.student_data.model.Student;
import com.btc.student_data.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping("/add-student")
	public String addStudent(@ModelAttribute Student student, Model m) {
		
		Student savedStudent = service.addStudent(student);
		m.addAttribute("student", savedStudent);
		return "show.jsp";
	}
	@GetMapping("/search")
	public String searchStudentByName(@RequestParam(value = "studentName") String studentName, Model m) {
		
		Student student = service.getStudentByName(studentName);
		m.addAttribute("student", student);
		return "show.jsp";
	}

}
