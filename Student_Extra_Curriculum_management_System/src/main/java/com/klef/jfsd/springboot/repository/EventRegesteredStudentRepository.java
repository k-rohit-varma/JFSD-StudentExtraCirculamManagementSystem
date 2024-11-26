package com.klef.jfsd.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.EventRegesteredStudent;

@Repository
public interface EventRegesteredStudentRepository extends JpaRepository<EventRegesteredStudent, Integer> {

	 @Query("SELECT CASE WHEN COUNT(e) > 0 THEN TRUE ELSE FALSE END FROM EventRegesteredStudent e WHERE e.eventName = ?1 AND e.studentId = ?2")
	 public boolean existsByEventAndStudentId(String eventName, String studentId);
	 
	 @Query("SELECT e FROM EventRegesteredStudent e WHERE e.studentId = ?1")
	    public List<EventRegesteredStudent> getAllRegisteredEvents(String studentId);
	 
	 @Query("SELECT e.number FROM EventRegesteredStudent e WHERE e.eventName = ?1 AND e.studentId = ?2")
	    public Integer findIdByEventNameAndStudentId(String eventName, String studentId);

}
