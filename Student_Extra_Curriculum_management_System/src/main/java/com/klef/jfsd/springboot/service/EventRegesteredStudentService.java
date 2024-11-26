package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.EventRegesteredStudent;

public interface EventRegesteredStudentService {
	
	public boolean registerStudentForEvent(String eventName,String id);
	
	public boolean checkStudentRegister(String eventName,String id);
	
	public List<EventRegesteredStudent> getAllStudents(String id);
	
	public int fetchByIdAndName(String id,String name);
	
	public void unRegisterEvent(int ind);
}
