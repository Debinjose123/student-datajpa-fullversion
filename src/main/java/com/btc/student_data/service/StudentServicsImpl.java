package com.btc.student_data.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btc.student_data.model.Student;
import com.btc.student_data.repository.StudentRepo;

@Service
@Transactional
public class StudentServicsImpl implements StudentService {

	@Autowired
	StudentRepo repo;
	
	@Override
	public Student addStudent(Student student) {
		
		return repo.save(student);
	}

	@Override
	public Student getStudentById(Long studentId) {
		
		return repo.getById(studentId);
	}

	@Override
	public Student getStudentByName(String studentName) {
		
		return repo.findByStudentName(studentName);
	}
	
	@Override
	public List<Student> getAllStudents() {
		
		return repo.findAll();
	}

	@Override
	public Student updateStudent(Student student) {
		
		return repo.save(student);
	}

	@Override
	public boolean deleteStudentById(long studentId) {

		repo.deleteById(studentId);
		return !repo.existsById(studentId);
	}

	

}
