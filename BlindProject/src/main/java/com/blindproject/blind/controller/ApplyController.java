package com.blindproject.blind.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.el.ImplicitObjectELResolver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysql.cj.Session;


@Controller
@RequestMapping("/apply/")
public class ApplyController {
	
	
	@GetMapping("MilitaryService")
	public String home(Model model) {
		
		return "apply.MilitaryService";
	}
	
	@RequestMapping("CareerService")
	public String careerservice() {

		return "apply.CareerService";
	}
	
	@RequestMapping("Introduction")
	public String Introduction ( Model model){

		return "apply.Introduction";
	}
}
