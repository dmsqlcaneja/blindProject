package com.blindproject.blind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blindproject.blind.dao.CompanyDao;
import com.blindproject.blind.dao.RecruitDivisionDao;
import com.blindproject.blind.dao.RecruitNoticeDao;
import com.blindproject.blind.entity.Company;
import com.blindproject.blind.entity.RecruitDivision;
import com.blindproject.blind.entity.RecruitNotice;

@Service
public class MybatisRecruitNoticeService implements RecruitNoticeService {

	@Autowired
	private RecruitNoticeDao recruitNoticeDao;
	
	@Autowired
	private CompanyDao companyDao;
	
	@Autowired
	private RecruitDivisionDao recruitDivisionDao;
	
	@Override
	public int insertRecruitNotice(RecruitNotice recruitNotice) {
		
		return recruitNoticeDao.insertRecruitNotice(recruitNotice);
	}

	@Override
	public int updateRecruitNotice(RecruitNotice recruitNotice) {
		
		return recruitNoticeDao.updateRecruitNotice(recruitNotice);
	}

	@Override
	public int deleteRecruitNotice(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public RecruitNotice getRecruitNotice(int id) {
		
		return recruitNoticeDao.getRecruitNotice(id);
	}

	@Override
	public List<RecruitNotice> getRecruitNoticeList() {
		
		return recruitNoticeDao.getRecruitNoticeList("id", "", 1);
	}

	@Override
	public List<RecruitNotice> getRecruitNoticeList(String field) {
		
		return recruitNoticeDao.getRecruitNoticeList(field, "", 1);
	}

	@Override
	public List<RecruitNotice> getRecruitNoticeList(String field, String query, int page) {
		
		return recruitNoticeDao.getRecruitNoticeList(field, query, page);
	}

	@Override
	public List<Company> getCompanyList() {
		
		return companyDao.getCompanyList();
	}

	@Override
	public List<RecruitDivision> getRecruitDivisionList() {
		
		return recruitDivisionDao.getRecruitDivisionList();
	}

}
