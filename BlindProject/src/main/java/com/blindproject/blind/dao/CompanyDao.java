package com.blindproject.blind.dao;

import java.util.List;

import com.blindproject.blind.entity.Company;

public interface CompanyDao {

	Company get(Integer id);
	
	List<Company> getCompanyList();
	
}
