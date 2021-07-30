package com.btc.student_data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.btc.student_data.model.Student;

public interface StudentRepo extends JpaRepository<Student,Long> {

	@Query("from Student where studentName=:studentName")
	public Student findByStudentName(@Param("studentName") String studentName);
}
