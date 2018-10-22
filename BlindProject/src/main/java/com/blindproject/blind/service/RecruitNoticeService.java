package com.blindproject.blind.service;

import java.util.List;

import com.blindproject.blind.entity.Company;
import com.blindproject.blind.entity.RecruitDivision;
import com.blindproject.blind.entity.RecruitNotice;

public interface RecruitNoticeService {
	
	//채용공고
	public int insertRecruitNotice(RecruitNotice recruitNotice);

	public int updateRecruitNotice(RecruitNotice recruitNotice);

	public int delete(Integer id);

	public RecruitNotice get(Integer id);

	public List<RecruitNotice> getList();

	public List<RecruitNotice> getList(String field);

	public List<RecruitNotice> getList(String field, String query, int page);
	
	//회사명
	public List<Company> getCompanyList();
	
	//채용구분
	public List<RecruitDivision> getRecruitDivisionList();
}
