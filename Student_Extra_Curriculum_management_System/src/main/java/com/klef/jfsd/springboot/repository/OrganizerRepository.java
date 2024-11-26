package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Organizer;

@Repository
public interface OrganizerRepository extends JpaRepository<Organizer, String> {

	@Query("select o from Organizer o where id=?1 and password=?2")
	public Organizer checkOrganizer(String id,String password);
	
}
