package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Event;
import com.klef.jfsd.springboot.model.Organizer;
import com.klef.jfsd.springboot.service.EventService;
import com.klef.jfsd.springboot.service.OrganizerService;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class OrganizerController {

	@Autowired
	EventService eventService;
	
	@Autowired
	OrganizerService  organizerService;
	
	@GetMapping("createEvent")
	public ModelAndView createEvent()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("createEvent");
		return mv;
	}
	
	@GetMapping("eventSuccess")
	public ModelAndView eventSuccess()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("eventSuccess");
		return mv;
	}
	
	
	
	
	@PostMapping("createEvents")
	public ModelAndView createEvents(HttpServletRequest request)
	{
		String name = request.getParameter("ename");
		String branch = request.getParameter("branch");
		String date= request.getParameter("date");
		String time=request.getParameter("time");
		String endtime = request.getParameter("endtime");
		String venue=request.getParameter("venue");
		String type=request.getParameter("type");
		int points=Integer.parseInt(request.getParameter("points"));
		int count=Integer.parseInt(request.getParameter("count"));
		Event event = new Event();
		event.setBranch(branch);
		event.setDate(date);
		event.setName(name);
		event.setPoints(points);
		event.setTime(time);
		event.setType(type);
		event.setVenue(venue);
		event.setEndtime(endtime);
		event.setMaxCount(count);
		ModelAndView mv = new ModelAndView();
		boolean bool = eventService.makeEvent(event);
		if(bool)
		{
			mv.setViewName("eventSuccess");
			System.out.println("Event added successfully");
		}
		else
		{
			mv.setViewName("createEvent");
			System.out.println("Event not added ");
			
		}
		return mv;
	}
	
	@GetMapping("editOrganizer")
	public ModelAndView editOrganizer(@RequestParam String id)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("editOrganizer");
		
		Organizer organizer = organizerService.getOrganizer(id);
		System.out.println(organizer.getName());
		mv.addObject("organizer", organizer);
		return mv;
	}
	
	@GetMapping("organzierUpdateSuccess")
	public ModelAndView organzierUpdateSuccess()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("organzierUpdateSuccess");
		return mv;
	}
	
	@PostMapping("updateOrganizerData")
	public ModelAndView updateOrganizerData(HttpServletRequest request)
	{
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String phno = request.getParameter("phno");
		String gender = request.getParameter("gender");
		
		String message = organizerService.updateOrganizer(id, name, pass, email, phno, gender);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("organzierUpdateSuccess");
		mv.addObject("message",message);
		return mv;
	}
	
	
	@GetMapping("editEvent")
	public ModelAndView editEvent(@RequestParam String name)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("editEvent");
		Event event = organizerService.getEvent(name);
		System.out.println(event.getName());
		mv.addObject("event",event);
		return mv;
	}
	
	@PostMapping("editEventSuccess")
	public ModelAndView editEventSuccess(HttpServletRequest request)
	{
		String name = request.getParameter("ename");
		String branch = request.getParameter("ebranch");
		String date = request.getParameter("edate");
		String time = request.getParameter("etime");
		String endtime = request.getParameter("endtime");
		String venue = request.getParameter("evenue");
		String type = request.getParameter("etype");
		
		int points = Integer.parseInt(request.getParameter("epoints"));
		int count = Integer.parseInt(request.getParameter("ecount"));
		
		String message = organizerService.editEvent(name, branch, date, time,endtime, venue, type, points, count);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("editEventSuccess");
		mv.addObject("message",message);
		return mv;
	}
	
	@GetMapping("afterDeleteTable")
	public ModelAndView afterDeleteTable( @RequestParam String name)
	{
		ModelAndView mv = new ModelAndView();
		String message = eventService.deleteEvent(name);
		mv.setViewName("afterDeleteTable");
		mv.addObject("message",message);
		return mv;
	}
	
}
