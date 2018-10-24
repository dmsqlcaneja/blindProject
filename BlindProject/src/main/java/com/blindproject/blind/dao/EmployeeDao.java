package com.blindproject.blind.dao;

import com.blindproject.blind.entity.Employee;

public interface EmployeeDao {
	
	Employee getEmployee(int id);

	int insertEmployee(Employee employee);
	
}
