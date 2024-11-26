package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.EventRegesteredStudent;
import com.klef.jfsd.springboot.repository.EventRegesteredStudentRepository;

@Service
public class EventRegesteredStudentServiceImp implements EventRegesteredStudentService{

	@Autowired
	EventRegesteredStudentRepository ersr;
	@Override
	public boolean registerStudentForEvent(String eventName, String id) {
		EventRegesteredStudent ev = new EventRegesteredStudent();
		ev.setEventName(eventName);
		int sid = Integer.parseInt(id);
		ev.setStudentId(sid);
		boolean ans = false;
		try
		{
			ersr.save(ev);
			ans = true;
		}
		catch (Exception e) {
			// TODO: handle exception
			ans  = false;
		}
		return ans;
	}
	
	@Override
	public boolean checkStudentRegister(String eventName, String id) {
		return ersr.existsByEventAndStudentId(eventName, id);
	}
	
	@Override
	public List<EventRegesteredStudent> getAllStudents(String id) {
		return  ersr.getAllRegisteredEvents(id);
	}
	
	@Override
	public int fetchByIdAndName(String id, String name) {
		return ersr.findIdByEventNameAndStudentId(name, id);
	}
	
	@Override
	public void unRegisterEvent(int ind) {
		
		ersr.deleteById(ind);
	}
}
