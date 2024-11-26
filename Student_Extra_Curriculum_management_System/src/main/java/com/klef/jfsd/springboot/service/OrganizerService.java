package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Event;
import com.klef.jfsd.springboot.model.Organizer;

public interface OrganizerService {
	
	public String saveEventOrganizer(Organizer o);
	
	public Organizer checkOrganizer(String id,String password);
	
	public List<Organizer> showEventOrganizers();
	
	public Organizer getOrganizer(String id);
	
	public String updateOrganizer(String id,String name,String pass,String email,String phno,String gender);
	
	public String deleteOrganizer(String id);
	
	public Event getEvent(String name);
	
	public String editEvent(String name,String branch,String date,String time,String endtime,String venue,String type, int points,int maxCount);
}
