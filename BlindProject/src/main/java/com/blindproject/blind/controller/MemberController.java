package com.blindproject.blind.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/member/")
public class MemberController {
	
	
	@GetMapping("notice1")
	public String home(Model model) {
		
		return "member.notice1";
	}	
	
	@GetMapping("notice2")
	public String home1(Model model) {
		
		return "member.notice2";
	}
	
	@GetMapping("notice3")
	public String home2(Model model) {
		
		return "member.notice3";
	}	
	
}
