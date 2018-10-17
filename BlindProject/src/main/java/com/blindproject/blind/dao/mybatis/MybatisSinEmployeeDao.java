package com.blindproject.blind.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blindproject.blind.dao.SinEmployeeDao;
import com.blindproject.blind.entity.SinEmployee;

@Repository
public class MybatisSinEmployeeDao implements SinEmployeeDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public SinEmployee get(Integer id) {
		
		SinEmployeeDao sinEmployeeDao = sqlSession.getMapper(SinEmployeeDao.class);
		
		return sinEmployeeDao.get(id);
	}

	@Override
	public int insert(SinEmployee sinEmployee) {
		
		SinEmployeeDao sinEmployeeDao = sqlSession.getMapper(SinEmployeeDao.class);
		
		return sinEmployeeDao.insert(sinEmployee);
	}

}
