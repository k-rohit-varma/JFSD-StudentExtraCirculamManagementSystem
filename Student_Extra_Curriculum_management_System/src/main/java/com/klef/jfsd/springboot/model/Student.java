package com.klef.jfsd.springboot.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_table")
public class Student {
	
	@Id
	@Column(name = "Student_id")
	String id;
	
	@Column(name="Student_name")
	String name;
	
	@Column(name = "Student_password")
	String password;
	
	@Column(name = "Student_email",unique = true)
	String email;
	
	@Column(name = "Student_phoneNumber",unique = true)
	String phNumber;
	
	@Column(name = "Student_gender")
	String gender;
	
	
	
	@Column( name = "Student_points")
	int points;
	//no of events registered ,  total points 
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	
	
}
