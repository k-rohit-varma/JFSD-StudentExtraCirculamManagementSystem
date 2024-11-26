package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Event;
import com.klef.jfsd.springboot.model.EventRegesteredStudent;
import com.klef.jfsd.springboot.service.EventRegesteredStudentService;
import com.klef.jfsd.springboot.service.EventService;

import ch.qos.logback.core.model.Model;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class StudentController {
	
	@Autowired
	EventService eventService;
	
	@Autowired
	EventRegesteredStudentService rService;
	
	String status = "not registered";

	
	@GetMapping("studenthome")
	public ModelAndView studenthome(@RequestParam String id)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("studenthome");
		mv.addObject("id",id);
		return mv;
	}
	
	@GetMapping("showAllEventForStudent")
	public ModelAndView showAllEventForStudent(@RequestParam String id)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("showAllEventForStudent");
		List<Event> eventlist = eventService.showAllEvents();
		mv.addObject("eventlist",eventlist);
		mv.addObject("id",id);	
		mv.addObject("status",status);
		return mv;
	}
	
	
	@GetMapping("studentEventRegisterPage")
	public ModelAndView studentEventRegisterPage(@RequestParam("name") String name,@RequestParam("id") String id)
	{
		ModelAndView mv = new ModelAndView();
		if(!rService.checkStudentRegister(name, id))
		{
			//need to register
			if(rService.registerStudentForEvent(name, id))
			{
				mv.setViewName("studentEventRegisterSuccess");
				mv.addObject("id",id);
			}
			else
			{
				mv.setViewName("showAllEventForStudent");
				mv.addObject("id",id);
			}
		}
		else
		{
			//already registered
			mv.setViewName("alreadyRegistered");
			mv.addObject("id",id);
		}
		return mv;
		
	}
	@GetMapping("StudentProfile")
	public ModelAndView StudentProfile()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("StudentProfile");																	
		return mv;
	}
	
	@GetMapping("Events")
	public ModelAndView showRegesteredEvents(@RequestParam("id") String id)
	{
		ModelAndView mv = new ModelAndView();
		List<EventRegesteredStudent> list = rService.getAllStudents(id);
		mv.setViewName("showRegesteredEvents");
		mv.addObject("id", id);
		mv.addObject("list",list);
		return mv;
	}
	@GetMapping("EventUnregister")
	public ResponseEntity<String> eventUnRegister(@RequestParam("id")String id,@RequestParam("name") String name)
	{
		
		int index = rService.fetchByIdAndName(id, name);
		rService.unRegisterEvent(index);
		return new ResponseEntity<>("event unregisterd",HttpStatus.OK);
	}
}
