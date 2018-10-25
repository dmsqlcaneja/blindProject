package com.blindproject.blind.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blindproject.blind.dao.CareerDao;
import com.blindproject.blind.dao.CompanyDao;
import com.blindproject.blind.entity.Career;

@Repository
public class MybatisCareerDao implements CareerDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertCareer(Career career) {
		CareerDao careerDao = sqlSession.getMapper(CareerDao.class);

		return careerDao.insertCareer(career);
	}
}
