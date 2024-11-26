package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Organizer;
import com.klef.jfsd.springboot.service.AdminService;
import com.klef.jfsd.springboot.service.OrganizerService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	OrganizerService organizerService;

	@GetMapping("adminlogin")
	public ModelAndView alllogin()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminlogin");
		return mv;
	}
	
	  @PostMapping("checkadminlogin")
	    public ModelAndView checkadminlogin(HttpServletRequest request) {
	        ModelAndView mv = new ModelAndView();
	        String id = request.getParameter("sid");
	        String pwd = request.getParameter("spwd");

	        Admin admin = adminService.chechAdminLogin(id, pwd);

	        if (admin != null) {
	            HttpSession session = request.getSession();
	            session.setAttribute("a", admin);
	            mv.setViewName("redirect:/adminhome");  // Redirect to GET mapping
	        } else {
	            mv.setViewName("adminlogin");
	        }
	        return mv;
	    }
	
	@GetMapping("makeeventorganizer")
	public ModelAndView makeeventorganizer()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("makeeventorganizer");
		return mv;
	}
	
	@PostMapping("saveeventorganizer")
	public ModelAndView saveeventorganizer(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		String id = request.getParameter("oid");
		String name = request.getParameter("oname");
		String email = request.getParameter("oemail");
		String pno = request.getParameter("opn");
		String gender = request.getParameter("ogender");
		String opwd = request.getParameter("opwd");
		String msg="";
		try {
			
			Organizer org = new Organizer();
			org.setId(id);
			org.setName(name);
			org.setEmail(email);
			org.setPhNumber(pno);
			org.setPassword(opwd);
			org.setGender(gender);
			msg = organizerService.saveEventOrganizer(org);
			mv.setViewName("adminhome");
			
		} catch (Exception e) {
			mv.setViewName("catchpage");
		
	}
		return mv;

	}
	
	@GetMapping("showEventOrganizers")
	public ModelAndView showEventOrganizers()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("showEventOrganizers");
		List<Organizer> organizers = organizerService.showEventOrganizers();
		mv.addObject("organizerList", organizers);
		return mv;
	}
	@GetMapping("adminhome")
	public ModelAndView adminhome()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminhome");
		return mv;
	}
	
	@GetMapping("deteleteOrganizer")
	public ModelAndView deteleteOrganizer(@RequestParam String id)
	{
		ModelAndView mv = new ModelAndView();
		String message = organizerService.deleteOrganizer(id);
		mv.setViewName("afterDelete");
		mv.addObject("message",message);
		return mv;
	}
	
	@GetMapping("adminlogout")
	public ModelAndView adminlogout(HttpServletRequest request) {
	    ModelAndView mv = new ModelAndView();
	    HttpSession session = request.getSession();
	    session.removeAttribute("a");
	    session.invalidate();  // Completely invalidate the session
	    mv.setViewName("index");  // Redirect to home or login page
	    return mv;
	}

	
}
	
