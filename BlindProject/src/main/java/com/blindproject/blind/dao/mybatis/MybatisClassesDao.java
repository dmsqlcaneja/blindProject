package com.blindproject.blind.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blindproject.blind.dao.ClassesDao;
import com.blindproject.blind.dao.MilitaryGroupDao;
import com.blindproject.blind.entity.Classes;

@Repository
public class MybatisClassesDao implements ClassesDao{

	@Autowired
	private SqlSession sqlSession;
	@Autowired
	private ClassesDao classesDao;
	
	@Override
	public Classes get(Integer id) {
		ClassesDao classesDao = sqlSession.getMapper(ClassesDao.class);
		return classesDao.get(id);
	}

	@Override
	public int insert(Classes classes) {
		ClassesDao classesDao = sqlSession.getMapper(ClassesDao.class);
		return classesDao.insert(classes);
	}

	@Override
	public List<Classes> getList() {
		ClassesDao classesDao = sqlSession.getMapper(ClassesDao.class);
		return classesDao.getList();
	}
	

}
