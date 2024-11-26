package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Organizer;
import com.klef.jfsd.springboot.repository.AdminRepository;
import com.klef.jfsd.springboot.repository.OrganizerRepository;

@Service
public class AdminServiceImp implements AdminService{

	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	OrganizerRepository organizerRepository;
	@Override
	public Admin chechAdminLogin(String id, String password) {
		return adminRepository.chechAdminLogin(id, password);
	}
	

}
