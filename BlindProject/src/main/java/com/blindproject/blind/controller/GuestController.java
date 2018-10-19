package com.blindproject.blind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blindproject.blind.service.MybatisGuestService;



@Controller
@RequestMapping("/guest/")
public class GuestController {
	
	//@Autowired
	//private MybatisGuestService service;
	
	@GetMapping("login")
	public String login() {
		
		return "guest.login";
	
	}
	
	
	
	

}
