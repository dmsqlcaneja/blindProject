package com.blindproject.blind.controller.employee;

import java.util.List;

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
import com.blindproject.blind.dao.EmployeeDao;
import com.blindproject.blind.entity.Company;
import com.blindproject.blind.entity.RecruitDivision;
import com.blindproject.blind.entity.RecruitNotice;
import com.blindproject.blind.entity.Employee;

@Controller("employeeController")
@RequestMapping("/employee/")
public class HomeController {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private RecruitNoticeDao recruitNoticeDao;
	
	@Autowired
	private RecruitDivisionDao recruitDivisionDao;
	
	@Autowired
	private CompanyDao companyDao;
	
	@GetMapping("index")
	public String index(Model model) {
		
		//채용공고 가져오기
		List<RecruitNotice> recruitNotice = recruitNoticeDao.getList();
		
		model.addAttribute("recruitNoticeList", recruitNotice);
		
		return "employee.index";
	}
	
	//채용공고 등록 페이지
	@GetMapping("hire")
	public String hire(Model model) {
		
		List<Company> company = companyDao.getList();
		
		List<RecruitDivision> recruitDivision = recruitDivisionDao.getList();
		
		
		
		model.addAttribute("companyList", company);
		model.addAttribute("recruitDivisionList", recruitDivision);
		
		return "employee.hire";
	}
	
//	@PostMapping("hire")
//	public String hire() {
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
	public String join(Model model) {
		
		//회사명 가져오기
		List<Company> company = companyDao.getList();
		
		model.addAttribute("companyList", company);

		return "employee.join";
	}
	
}
