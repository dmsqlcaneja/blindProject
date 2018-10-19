package com.blindproject.blind.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.el.ImplicitObjectELResolver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.blindproject.blind.entity.Career;
import com.blindproject.blind.entity.CompanyCareer;
import com.blindproject.blind.entity.Military;
import com.mysql.cj.Session;


@Controller
@RequestMapping("/apply/")
public class ApplyController {

	
	
	//----------careerService------------------------------------------------------//
	@GetMapping("career-service")
	public String careerservice() {
		return "apply.career-service";
	}
	
	@PostMapping("career-service")
	public String careerservice(HttpSession session, CompanyCareer companyCareer,
			Career career) {
		System.out.println(companyCareer.getClass());
		//System.out.println(companyCareer.getPosition());
		return "apply.career-service";
	}
	//-------------------------------------------------------------------------------
	
	
	//----------introduction------------------------------------------------------//
	@RequestMapping("introduction")
	public String Introduction (Model model){

		return "apply.introduction";
	}
	//----------------------------------------------------------------------------//
	
	//----------index------------------------------------------------------//
	@RequestMapping("index")
	public String Index (Model model){

		return "apply.index";
	}
	//----------------------------------------------------------------//
	
	//----------military------------------------------------------------------//
	@GetMapping("military")
	public String military(HttpSession session,Model model, Military military) {
	
				
//		session.setAttribute("Military", military);
		return "apply.military";
		
	}
	
	
	@PostMapping("military")
	public String militaryservice(HttpSession session, Military military) {
		session.setAttribute("Military", military);
//		session.setAttribute("A", );
		return "";
	}
	//-------------------------------------------------------------------------------
	
}
