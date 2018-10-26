package com.blindproject.blind.dao.mybatis;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blindproject.blind.dao.ApplierDao;
import com.blindproject.blind.dao.EmployeeDao;
import com.blindproject.blind.entity.Applier;
import com.blindproject.blind.entity.Employee;

@Repository
public class MybatisApplierDao implements ApplierDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public Applier getApplier(int id) {
		
		ApplierDao applierDao = sqlSession.getMapper(ApplierDao.class);
		
		return applierDao.getApplier(id);
	}


	@Override
	public int insertApplier(Applier applier) {
		ApplierDao applierDao = sqlSession.getMapper(ApplierDao.class);
		
		return applierDao.insertApplier(applier);
	}
		

}
