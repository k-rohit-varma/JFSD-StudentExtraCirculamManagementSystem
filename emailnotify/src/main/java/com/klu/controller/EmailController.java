package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.EmailManager;
import com.klu.model.MailSending;

@RestController
@RequestMapping("/mail")
public class EmailController {

	@Autowired
	EmailManager M;
	
	@PostMapping("/send")
	public String send(@RequestBody MailSending mailSending)
	{
		return M.sendEmail(mailSending.getFromEmail(),mailSending.getToEmail(),mailSending.getSubject(),mailSending.getMessage());
	}
}
