package com.blindproject.blind.service;

import java.util.List;

import com.blindproject.blind.entity.Company;
import com.blindproject.blind.entity.RecruitDivision;
import com.blindproject.blind.entity.RecruitNotice;

public interface RecruitNoticeService {
	
	//채용공고
	public int insertRecruitNotice(RecruitNotice recruitNotice);

	public int updateRecruitNotice(RecruitNotice recruitNotice);

	public int deleteRecruitNotice(int id);

	public RecruitNotice getRecruitNotice(int id);

	public List<RecruitNotice> getRecruitNoticeList();

	public List<RecruitNotice> getRecruitNoticeList(String field);

	public List<RecruitNotice> getRecruitNoticeList(String field, String query, int page);
	
	//회사명
	public List<Company> getCompanyList();
	
	//채용구분
	public List<RecruitDivision> getRecruitDivisionList();
}
