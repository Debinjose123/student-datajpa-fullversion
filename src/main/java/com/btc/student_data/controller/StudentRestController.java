package com.btc.student_data.controller;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.btc.student_data.model.Student;
import com.btc.student_data.service.StudentService;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class StudentRestController {

	
	@Autowired
	StudentService service;
	
	@GetMapping("/students/student-name/{studentName}")
	public Student getStudentByName(@PathVariable("studentName") String studentName) {
		return service.getStudentByName(studentName);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		
		Student savedStudent = service.addStudent(student);
		return savedStudent;
		
		
	}
	

	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student student) {
		
		Student updatedStudent = service.updateStudent(student);
		return updatedStudent;
	
	}
	
	
	@DeleteMapping("/students/studentId/{studentId}")
	public boolean deleteStudentById(@PathVariable("studentId") long studentId) {
		return service.deleteStudentById(studentId);
	}
	
	
	
}