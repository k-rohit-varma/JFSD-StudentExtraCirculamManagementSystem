package com.klef.jfsd.springboot.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Event;
import com.klef.jfsd.springboot.model.Organizer;
import com.klef.jfsd.springboot.repository.EventRepository;
import com.klef.jfsd.springboot.repository.OrganizerRepository;

@Service
public class OrganizerServiceImp implements OrganizerService {

	@Autowired
	OrganizerRepository organizerRepository;
	
	@Autowired
	EventRepository eventRepository;
	@Override
	public String saveEventOrganizer(Organizer o) {
		String ms="";
		try
		{
			
			organizerRepository.save(o);
			ms = "Organizer Added Successfully";
		}
		catch (Exception e) {
			// TODO: handle exception
			ms="organizer Not Added";
		}
		return ms;
	}
	@Override
	public Organizer checkOrganizer(String id, String password) {
		return organizerRepository.checkOrganizer(id, password);
	}
	@Override
	public List<Organizer> showEventOrganizers() {
		return organizerRepository.findAll();
	}
	@Override
	public Organizer getOrganizer(String id) {
		return organizerRepository.getById(id);
	}
	@Override
	public String updateOrganizer(String id, String name, String pass, String email, String phno, String gender) {
		Optional<Organizer> optionalOrganizer = organizerRepository.findById(id);
		if(optionalOrganizer.isPresent())
		{
			Organizer organizer = optionalOrganizer.get();
			organizer.setEmail(email);
			organizer.setGender(gender);
			organizer.setId(id);
			organizer.setName(name);
			organizer.setPassword(pass);
			organizer.setPhNumber(phno);
			organizerRepository.save(organizer);
			return "Organizer updated successfully admin";
		}
		return "looks like organizer not found boss!!";
	}
	@Override
	public String deleteOrganizer(String id) {
		organizerRepository.deleteById(id);
		return "Organizer deleted successfully";
	}
	@Override
	public Event getEvent(String name) {
		return eventRepository.getById(name);
	}
	@Override
	public String editEvent(String name, String branch, String date, String time,String endtime, String venue, String type, int points,
			int maxCount) {
		Optional<Event> optionalEvent = eventRepository.findById(name);
		if(optionalEvent.isPresent())
		{
			Event event = optionalEvent.get();
			event.setName(name);
			event.setBranch(branch);
			event.setDate(date);
			event.setTime(time);
			event.setEndtime(endtime);
			event.setVenue(venue);
			event.setPoints(points);
			event.setMaxCount(maxCount);
			eventRepository.save(event);
			return "event edited successfully";
		}
		return "event not edited";
	}
	
	

}
