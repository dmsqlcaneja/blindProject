package com.blindproject.blind.service;


import com.blindproject.blind.entity.Admin;
import com.blindproject.blind.entity.Applier;
import com.blindproject.blind.entity.Employee;

public interface GuestService {

	int insertEmployee(Employee employee);
	int insertApplier(Applier applier);
	int insertAdmin(Admin admin);
	



	
}
