package com.blindproject.blind.dao;

import com.blindproject.blind.entity.Employee;

public interface EmployeeDao {
	
	Employee get(Integer id);

	int insert(Employee employee);
	
}
