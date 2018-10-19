package com.blindproject.blind.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blindproject.blind.dao.CompanyDao;
import com.blindproject.blind.dao.RecruitDivisionDao;
import com.blindproject.blind.dao.TypeDao;
import com.blindproject.blind.entity.Company;
import com.blindproject.blind.entity.Notice;
import com.blindproject.blind.entity.RecruitDivision;
import com.blindproject.blind.entity.Type;
import com.blindproject.blind.service.AdminService;

@Controller 
@RequestMapping("/admin/")
public class AdminController {
	
	@Autowired
	private CompanyDao companyDao;
	
	@Autowired
	private RecruitDivisionDao recruitDivisionDao;
	
	@Autowired
	private TypeDao typeDao;
	
	@Autowired
	private AdminService adminService;
	
	
	@GetMapping("index")
	public String AdminIndex(Model model) {
		
		return "admin.index";
		
	}
	
	//공지사항 등록 페이지 
	@GetMapping("notice/insert")
	public String NoticeInsert(Model model) {
		
		List<Company> company = companyDao.getList();
		List<RecruitDivision> recruitDivision = recruitDivisionDao.getList();
		List<Type> type = typeDao.getList();
		
		
		
		model.addAttribute("companyList", company);
		model.addAttribute("recruitDivisionList", recruitDivision);
		model.addAttribute("typeList", type);
		
		
		return "admin.notice_insert";
		
	}
	
	@PostMapping("notice/insert")
	public String NoticeInsert(Notice notice) {
		
		adminService.insertNotice(notice);
		
		return "admin.index";
		
	}
	
}
