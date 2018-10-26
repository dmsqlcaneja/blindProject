package com.blindproject.blind.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.blindproject.blind.dao.CompanyDao;
import com.blindproject.blind.entity.Company;

@Repository
public class MybatisCompanyDao implements CompanyDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public Company getCompany(int id) {
		
		CompanyDao companyDao = sqlSession.getMapper(CompanyDao.class);
		
		return companyDao.getCompany(id);
	}

	@Override
	public List<Company> getCompanyList() {
		
		CompanyDao companyDao = sqlSession.getMapper(CompanyDao.class);
		
		return companyDao.getCompanyList();
	}

}
