package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.EventRegesteredStudent;
import com.klef.jfsd.springboot.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>{

	@Query("select s from Student s where s.id=?1 and s.password=?2")
	public Student checkStudentLogin(String id,String password);
	
	
}
