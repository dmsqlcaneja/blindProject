package com.blindproject.blind.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blindproject.blind.dao.TypeDao;
import com.blindproject.blind.entity.Type;

@Repository
public class MybatisTypeDao implements TypeDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public Type getType(int id) {
		
		TypeDao typeDao = sqlSession.getMapper(TypeDao.class);
		
		return typeDao.getType(id);
	}
	
	@Override
	public List<Type> getTypeList() {
		
		TypeDao typeDao = sqlSession.getMapper(TypeDao.class);
		
		return typeDao.getTypeList();
	}

}
