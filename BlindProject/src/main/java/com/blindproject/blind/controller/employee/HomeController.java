package com.blindproject.blind.controller.employee;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blindproject.blind.dao.CompanyDao;
import com.blindproject.blind.dao.RecruitDivisionDao;
import com.blindproject.blind.dao.RecruitNoticeDao;
import com.blindproject.blind.dao.SinEmployeeDao;
import com.blindproject.blind.entity.Company;
import com.blindproject.blind.entity.RecruitDivision;
import com.blindproject.blind.entity.RecruitNotice;
import com.blindproject.blind.entity.SinEmployee;

@Controller("employeeController")
@RequestMapping("/employee/")
public class HomeController {

	@Autowired
	private SinEmployeeDao sinEmployeeDao;
	
	@Autowired
	private RecruitNoticeDao recruitNoticeDao;
	
	@Autowired
	private RecruitDivisionDao recruitDivisionDao;
	
	@Autowired
	private CompanyDao companyDao;
	
	@GetMapping("index")
	public String index(Model model) {
		
		//채용공고 가져오기
//		RecruitNotice recruitNotice = recruitNoticeDao.get(1);
//		model.addAttribute("recruitNotice", recruitNotice);
		
		return "employee.index";
	}
	
	//채용공고 등록 페이지
	@GetMapping("hire")
	public String hire(Model model) {
		
		//회사명 가져오기
		Company company = companyDao.get(1);
		model.addAttribute("company", company);
		
		return "employee.hire";
	}
	
//	@PostMapping("hire")
//	public String hire(RecruitNotice recruitNotice) {
//		
//		return "<script>alert('등록 완료 되었습니다..');location.href='./index';</script>";
//	}
	
	@GetMapping("detail")
	public String detail() {
		return "employee.detail";
	}
	
	
	//로그인, 회원가입 페이지
	@GetMapping("login")
	public String login() {
		
		return "employee.login";
	}
	
	@GetMapping("join")
	public String join() {
		
		return "employee.join";
	}
	
//	@PostMapping("join")
//	public String join(SinEmployee sinEmployee) {
//		
//		return "<script>alert('등록 완료 되었습니다..');location.href='./login';</script>";
//	}
	
}
