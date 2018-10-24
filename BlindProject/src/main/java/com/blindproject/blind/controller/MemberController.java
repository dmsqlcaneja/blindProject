package com.blindproject.blind.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blindproject.blind.dao.RecruitDivisionDao;
import com.blindproject.blind.dao.RecruitNoticeDao;
import com.blindproject.blind.entity.RecruitDivision;
import com.blindproject.blind.entity.RecruitNotice;


@Controller
@RequestMapping("/member/")
public class MemberController {

	@Autowired
	private RecruitNoticeDao recruitNoticeDao;
	
	@Autowired
	private RecruitDivisionDao recruitDivisionDao;
	
	@GetMapping("RecruitNotice")
	public String home(Model model) {
		
		List<RecruitNotice> recruitNotice = recruitNoticeDao.getRecruitNoticeList();		
		model.addAttribute("recruitNoticeList", recruitNotice);			
	
		
		List<RecruitDivision> recruitDivision = recruitDivisionDao.getRecruitDivisionList();		
		model.addAttribute("recruitDivisionList", recruitDivision);			
		
		return "member.RecruitNotice";
	}	
	
	@GetMapping("RegularRecruit")
	public String home1(Model model) {
		
		return "member.RegularRecruit";
	}
	
	@GetMapping("Notice")
	public String home2(Model model) {
		
		return "member.Notice";
	}	
	
}
