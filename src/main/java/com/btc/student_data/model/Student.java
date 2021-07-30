package com.btc.student_data.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;



@Entity

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long studentId;
	
	public long getStudentId() {
		return studentId;
	}

	public Student(long studentId, String studentName, LocalDate birthDate) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", birthDate=" + birthDate + "]";
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Column(name = "student_name", nullable = false)
	private String studentName;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthDate;
}
