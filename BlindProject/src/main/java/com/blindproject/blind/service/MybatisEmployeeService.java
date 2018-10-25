package com.blindproject.blind.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blindproject.blind.dao.CompanyDao;
import com.blindproject.blind.dao.EmployeeDao;
import com.blindproject.blind.entity.Company;
import com.blindproject.blind.entity.Employee;

@Service
public class MybatisEmployeeService {

	@Autowired
	private CompanyDao companyDao;
	
	@Autowired
	private EmployeeDao sinEmployeeDao;
	
	public Company getCompany(int id) {
		
		return companyDao.getCompany(id);
	}
	
	//회원가입
	public int insertEmployee(Employee sinEmployee) {
		
		int result = sinEmployeeDao.insertEmployee(sinEmployee);

		return result;
	}
}
