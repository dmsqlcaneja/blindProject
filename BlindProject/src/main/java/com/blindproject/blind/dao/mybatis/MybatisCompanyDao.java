package com.blindproject.blind.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blindproject.blind.dao.CompanyDao;
import com.blindproject.blind.entity.Company;

@Repository
public class MybatisCompanyDao implements CompanyDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public Company get(Integer id) {
		
		CompanyDao companyDao = sqlSession.getMapper(CompanyDao.class);
		
		return companyDao.get(id);
	}

	@Override
	public List<Company> getList() {
		
		CompanyDao companyDao = sqlSession.getMapper(CompanyDao.class);
		
		return companyDao.getList();
	}

}
