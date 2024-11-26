package com.klef.jfsd.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Email;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class EmailController {
	
	@Autowired
	public RestTemplate restTemplate;
	
	@GetMapping("/emailPage")
	public ModelAndView emailPage()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("email");
		return mv;
	}
	
	@PostMapping("/sending")
	public ModelAndView sendingEmail(HttpServletRequest request)
	{
		String fromEmail="kunaparajurohitvarma@gmail.com";
		String toEmail = request.getParameter("toEmail");
		String subject = request.getParameter("subject");
		String message = request.getParameter("message");
		
		Email e = new Email();
		e.setFromEmail(fromEmail);
		e.setMessage(message);
		e.setSubject(subject);
		e.setToEmail(toEmail);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<Email> requestEntity = new HttpEntity<Email>(e,headers);
		
		String url="http://localhost:1234/mail/send";
		ResponseEntity<String> res = restTemplate.exchange(url,HttpMethod.POST,requestEntity,String.class);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminhome");
		return mv;
	}
	
}
