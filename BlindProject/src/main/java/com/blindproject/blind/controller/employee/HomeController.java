package com.blindproject.blind.controller.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blindproject.blind.dao.CompanyDao;
import com.blindproject.blind.entity.Company;
import com.blindproject.blind.entity.RecruitNotice;
import com.blindproject.blind.service.RecruitNoticeService;

@Controller("employeeController")
@RequestMapping("/employee/")
public class HomeController {

	@Autowired
	private CompanyDao companyDao;
	
	@Autowired
	private RecruitNoticeService recruitNoticeService;
	
	@GetMapping("index")
	public String index(Model model) {
		
		//채용공고 가져오기
		List<RecruitNotice> recruitNoticeList = recruitNoticeService.getList();
		
		model.addAttribute("recruitNoticeList", recruitNoticeList);
		
		return "employee.index";
	}
	
	
	
	//채용공고 상세 페이지
	@GetMapping("detail")
	public String detail(Model model
			, @RequestParam("id") Integer id) {

		RecruitNotice notice = recruitNoticeService.get(id);
		
		model.addAttribute("rnl", notice);
		
		return "employee.detail";
	}
	
	
	
	//로그인, 회원가입 페이지
	@GetMapping("login")
	public String login() {
		
		return "employee.login";
	}
	
	@GetMapping("join")
	public String join(Model model) {
		
		//회사명 가져오기
		List<Company> company = companyDao.getCompanyList();
		
		model.addAttribute("companyList", company);

		return "employee.join";
	}
	
}
