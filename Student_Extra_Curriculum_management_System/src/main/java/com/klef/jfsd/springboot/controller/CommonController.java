package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Event;
import com.klef.jfsd.springboot.model.Organizer;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.service.EventService;
import com.klef.jfsd.springboot.service.OrganizerService;
import com.klef.jfsd.springboot.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CommonController {
    
    @Autowired
    OrganizerService organizerService;
    
    @Autowired
    StudentService studentService;
    
    @Autowired
    EventService eventService;

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @GetMapping("alllogin")
    public ModelAndView alllogin() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("alllogin");
        return mv;
    }

    @PostMapping("checkNormalLogin")
    public ModelAndView checkNormalLogin(HttpServletRequest request) {
        String id = request.getParameter("sid");
        String password = request.getParameter("spwd");
        ModelAndView mv = new ModelAndView();
        Organizer org = organizerService.checkOrganizer(id, password);
        Student student = studentService.checkStudentLogin(id, password);

        if (org != null) {
            HttpSession session = request.getSession();
            session.setAttribute("o", org);
            mv.setViewName("redirect:/organizerhome");
        } else if (student != null) {
            
            mv.setViewName("studenthome");
            mv.addObject("id",id);
        } else {
            mv.setViewName("alllogin");
        }
        return mv;
    }

    @GetMapping("organizerhome")
    public ModelAndView organizerHome(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        Organizer organizer = (Organizer) session.getAttribute("o");

        if (organizer == null) {
            mv.setViewName("redirect:/alllogin");  // Redirect to login if session expired
            return mv;
        }

        mv.setViewName("organizerhome");
        return mv;
    }

    @GetMapping("organizerlogout")
    public ModelAndView organizerLogout(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        session.invalidate();  // Invalidate the session
        mv.setViewName("redirect:/index.jsp");  // Redirect to index page after logout
        return mv;
    }

    @GetMapping("showAllEvents")
    public ModelAndView showAllEvents() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("showAllEvents");
        List<Event> events = eventService.showAllEvents();
        mv.addObject("eventsList", events);
        return mv;
    }
}
