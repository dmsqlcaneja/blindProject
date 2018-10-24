package com.blindproject.blind.dao;

import java.util.List;

import com.blindproject.blind.entity.Company;

public interface CompanyDao {

	Company getCompany(int id);
	
	List<Company> getCompanyList();
	
}
