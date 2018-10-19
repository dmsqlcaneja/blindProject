package com.blindproject.blind.controller.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		List<RecruitNotice> recruitNoticeList = recruitNoticeDao.getList();
		
		model.addAttribute("recruitNoticeList", recruitNoticeList);
		
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
	
	@PostMapping("hire")
	public String hire(HttpServletRequest request) throws ParseException {
		
		RecruitNotice recruitNotice = new RecruitNotice();
		recruitNotice.setTitle(request.getParameter("title"));
		recruitNotice.setContents(request.getParameter("contents"));

		System.out.println(request.getParameter("title"));
		System.out.println(request.getParameter("contents"));
		
		Date strDate = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("strDate"));
		Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("endDate"));
		recruitNotice.setStrDate(strDate);
		recruitNotice.setEndDate(endDate);
		
		recruitNoticeDao.insertRecruitNotice(recruitNotice);
		
		return "employee.index";
	}
	
	@GetMapping("detail")
	public String detail(Model model
			, @RequestParam("id") Integer id) {

		RecruitNotice notice = recruitNoticeDao.get(id);
		
		model.addAttribute("rnl", notice);
		
		return "employee.detail";
	}
	
	@GetMapping("edit")
	public String edit(Model model
			, @RequestParam("id") Integer id) {
		
		RecruitNotice notice = recruitNoticeDao.get(id);
		
		model.addAttribute("rnl", notice);
		
		List<Company> company = companyDao.getList();
		
		model.addAttribute("companyList", company);

		List<RecruitDivision> recruitDivision = recruitDivisionDao.getList();
		
		model.addAttribute("recruitDivisionList", recruitDivision);
		
		return "employee.edit";
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
