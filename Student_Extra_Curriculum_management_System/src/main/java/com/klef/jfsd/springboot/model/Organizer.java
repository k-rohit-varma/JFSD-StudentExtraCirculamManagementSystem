package com.klef.jfsd.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Organizer_table")
public class Organizer {

	@Id
	@Column(name = "Organizer_id")
	String id;
	
	@Column(name = "Organizer_name")
	String name;
	
	
	@Column(name = "Organizer_password")
	String password;
	
	@Column(name = "Organizer_email",unique = true)
	String email;
	
	@Column(name = "Organizer_phoneNumber",unique = true)
	String phNumber;
	
	@Column(name = "Organizer_gender")
	String gender;

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
	
	
}
