package com.blindproject.blind.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blindproject.blind.dao.CompanyDao;
import com.blindproject.blind.dao.SinEmployeeDao;
import com.blindproject.blind.entity.Company;
import com.blindproject.blind.entity.SinEmployee;

@Service
public class MybatisEmployeeService {

	@Autowired
	private CompanyDao companyDao;
	
	@Autowired
	private SinEmployeeDao sinEmployeeDao;
	
	public Company getCompany(Integer id) {
		
		return companyDao.get(id);
	}
	
	//회원가입
	public int insertEmployee(SinEmployee sinEmployee) {
		
		int result = sinEmployeeDao.insert(sinEmployee);
		
		return result;
	}
}
