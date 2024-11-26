package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Organizer;

public interface AdminService {

	public Admin chechAdminLogin(String id,String password);
	
	
}
