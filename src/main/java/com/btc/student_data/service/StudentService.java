package com.btc.student_data.service;

import java.util.List;

import com.btc.student_data.model.Student;


public interface StudentService {

	public Student addStudent(Student student);
	
	public Student getStudentById(Long studentId);
	
	public Student getStudentByName(String studentName);
	
	public List<Student> getAllStudents();
	
	public Student updateStudent(Student student);
	
	public boolean deleteStudentById(long studentId);
}
