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
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public RecruitNotice get(Integer id) {
		
		return recruitNoticeDao.get(id);
	}

	@Override
	public List<RecruitNotice> getList() {
		
		return recruitNoticeDao.getList("id", "", 1);
	}

	@Override
	public List<RecruitNotice> getList(String field) {
		
		return recruitNoticeDao.getList(field, "", 1);
	}

	@Override
	public List<RecruitNotice> getList(String field, String query, int page) {
		
		return recruitNoticeDao.getList(field, query, page);
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
