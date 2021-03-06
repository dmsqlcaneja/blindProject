package com.blindproject.blind.dao.mybatis;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blindproject.blind.dao.EmployeeDao;
import com.blindproject.blind.entity.Employee;

@Repository
public class MybatisEmployeeDao implements EmployeeDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public Employee getEmployee(int id) {
		
		EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
		
		return employeeDao.getEmployee(id);
	}

	@Override
	public int insertEmployee(Employee employee) {
		
		EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
		
		return employeeDao.insertEmployee(employee);
	}
		

}
