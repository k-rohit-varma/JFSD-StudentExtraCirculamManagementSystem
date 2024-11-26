package com.klef.jfsd.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Event_And_Student")
public class EventRegesteredStudent {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	int number;
	@Column(name = "event_name")
	String eventName;
	
	@Column(name = "student_id")
	int studentId;
	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
}
