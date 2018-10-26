package com.blindproject.blind.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.blindproject.blind.dao.AdminDao;
import com.blindproject.blind.dao.ApplierDao;
import com.blindproject.blind.dao.EmployeeDao;
import com.blindproject.blind.entity.Admin;
import com.blindproject.blind.entity.Applier;
import com.blindproject.blind.entity.Employee;

@Service
public class MybatisGuestService implements GuestService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private ApplierDao applierDao;
	
	@Autowired
	private AdminDao adminDao;

	@Override
	public int insertEmployee(Employee employee) {
		// 암호화
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPwd = encoder.encode(employee.getPwd());
		employee.setPwd(encodedPwd);
		
		int result = employeeDao.insertEmployee(employee);
		return result;
	}

	@Override
	public int insertApplier(Applier applier) {
		
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPwd = encoder.encode(applier.getPwd());
		applier.setPwd(encodedPwd);
				
		int result = applierDao.insertApplier(applier);
		return result;
	}

	@Override
	public int insertAdmin(Admin admin) {
		
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPwd = encoder.encode(admin.getPwd());
		admin.setPwd(encodedPwd);
				
		int result = adminDao.insertAdmin(admin);
		return result;
	}
}