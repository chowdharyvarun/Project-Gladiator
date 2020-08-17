package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lti.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	AdminService service;
	
	public boolean loginAdmin(int userId, String password) {
		return service.loginAdmin(userId, password);
	}

}
