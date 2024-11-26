package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Event;

public interface EventService {

	public boolean makeEvent(Event e);
	
	public List<Event> showAllEvents();
	
	public String deleteEvent(String name);
}
