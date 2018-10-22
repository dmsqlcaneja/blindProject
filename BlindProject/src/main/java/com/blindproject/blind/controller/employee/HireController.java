package com.blindproject.blind.controller.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blindproject.blind.entity.Company;
import com.blindproject.blind.entity.RecruitDivision;
import com.blindproject.blind.entity.RecruitNotice;
import com.blindproject.blind.service.RecruitNoticeService;

@Controller
@RequestMapping("/employee/")
public class HireController {

	@Autowired
	private RecruitNoticeService recruitNoticeService;

	// 채용공고 등록 페이지
	@GetMapping("hire")
	public String hire(Model model) {

		List<Company> companyList = recruitNoticeService.getCompanyList();

		List<RecruitDivision> recruitDivisionList = recruitNoticeService.getRecruitDivisionList();

		model.addAttribute("companyList", companyList);
		model.addAttribute("recruitDivisionList", recruitDivisionList);

		return "employee.hire";
	}

	@PostMapping("hire")
	public String hire(HttpServletRequest request) throws ParseException {

		RecruitNotice recruitNotice = new RecruitNotice();
		recruitNotice.setTitle(request.getParameter("title"));
		recruitNotice.setContents(request.getParameter("contents"));

		Date strDate = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("strDate"));
		Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("endDate"));
		recruitNotice.setStrDate(strDate);
		recruitNotice.setEndDate(endDate);

		Integer rdid = Integer.parseInt(request.getParameter("recruitDivisionId"));
		recruitNotice.setRecruitDivisionId(rdid);

		Integer cid = Integer.parseInt(request.getParameter("companyId"));
		recruitNotice.setCompanyId(cid);

		recruitNoticeService.insertRecruitNotice(recruitNotice);

		return "redirect:index";
	}

	// 채용공고 수정 페이지
	@GetMapping("edit")
	public String edit(Model model, 
			@RequestParam("id") Integer id) {

		RecruitNotice notice = recruitNoticeService.get(id);

		model.addAttribute("rnl", notice);

		List<Company> companyList = recruitNoticeService.getCompanyList();

		model.addAttribute("companyList", companyList);

		List<RecruitDivision> recruitDivisionList = recruitNoticeService.getRecruitDivisionList();

		model.addAttribute("recruitDivisionList", recruitDivisionList);

		return "employee.edit";
	}

	@PostMapping("edit")
	public String edit(HttpServletRequest request, 
			@RequestParam("id") Integer id) throws ParseException {

		RecruitNotice recruitNotice = recruitNoticeService.get(id);
		recruitNotice.setTitle(request.getParameter("title"));
		recruitNotice.setContents(request.getParameter("contents"));

		Date strDate = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("strDate"));
		Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("endDate"));
		recruitNotice.setStrDate(strDate);
		recruitNotice.setEndDate(endDate);

		Integer rdid = Integer.parseInt(request.getParameter("recruitDivisionId"));
		recruitNotice.setRecruitDivisionId(rdid);

		Integer cid = Integer.parseInt(request.getParameter("companyId"));
		recruitNotice.setCompanyId(cid);

		recruitNoticeService.updateRecruitNotice(recruitNotice);

		return "redirect:index";
	}

}
