package com.blindproject.blind.dao.mybatis;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blindproject.blind.dao.AdminDao;
import com.blindproject.blind.dao.EmployeeDao;
import com.blindproject.blind.entity.Admin;
import com.blindproject.blind.entity.Employee;

@Repository
public class MybatisAdminDao implements AdminDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public Admin getAdmin(int id) {
		
		AdminDao adminDao = sqlSession.getMapper(AdminDao.class);
		
		return adminDao.getAdmin(id);
	}

	@Override
	public int insertAdmin(Admin admin) {
		
		AdminDao adminDao = sqlSession.getMapper(AdminDao.class);
		
		return adminDao.insertAdmin(admin);
	}		

}
