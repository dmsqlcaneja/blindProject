package com.blindproject.blind.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blindproject.blind.dao.ApplyDao;
import com.blindproject.blind.entity.Apply;

@Repository
public class MybatisApplyDao implements ApplyDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertApply(Apply apply) {
		ApplyDao applyDao = sqlSession.getMapper(ApplyDao.class);
		return applyDao.insertApply(apply);
	}

	@Override
	public int getId(Apply apply) {
		ApplyDao applyDao = sqlSession.getMapper(ApplyDao.class);
		return applyDao.getId(apply);
	}


}