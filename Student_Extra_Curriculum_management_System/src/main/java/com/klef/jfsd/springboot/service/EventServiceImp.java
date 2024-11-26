package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Event;
import com.klef.jfsd.springboot.repository.EventRepository;

@Service
public class EventServiceImp implements EventService{

	@Autowired
	EventRepository eventRepository;
	
	@Override
	public boolean makeEvent(Event e) {
		 boolean bool = false;
		 try
		 {
			 eventRepository.save(e);
			 bool = true;
		 }
		 catch (Exception e1) {
			// TODO: handle exception
			 System.out.println(e1.getMessage());
		}
		 return bool;
	}

	
	@Override
	public List<Event> showAllEvents() {
		return eventRepository.findAll();
	}


	@Override
	public String deleteEvent(String name) {
		eventRepository.deleteById(name);
		return "Event Deleted successfully";
	}

}
