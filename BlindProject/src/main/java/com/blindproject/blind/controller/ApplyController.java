package com.blindproject.blind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blindproject.blind.entity.Apply;
import com.blindproject.blind.entity.Career;
import com.blindproject.blind.entity.Resume;
import com.blindproject.blind.service.ApplyService;


@Controller
@RequestMapping("/apply/")
public class ApplyController {

	@Autowired
	private ApplyService service;

	// ----------careerService------------------------------------------------------//
	@RequestMapping("resume")
	public String career(Model model, Resume resume) {
		
		return "apply.resume";
	}

	@PostMapping("resume")
	public String careerservice(/*HttpSession session,*/ Resume resume, Career career) {
		int recruitNoticeId = 1;
		int applierId = 1;
		
		service.insertResume(resume, career, new Apply(recruitNoticeId, applierId));
		/*service.insertCareer(career);*/
		
//		session.setAttribute("Resume", resume);
		return "apply.resume";

		// -------------------------------------------------------------------------------
	}
	//index  id 참조 
	@RequestMapping("index")
	public String career() {
		
		return "apply.index";
	}
}
