package com.blindproject.blind.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blindproject.blind.dao.MilitaryGroupDao;
import com.blindproject.blind.entity.MilitaryGroup;

@Repository
public class MybatisMilitaryGroupDao implements MilitaryGroupDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public MilitaryGroup get(Integer id) {
		MilitaryGroupDao militaryGroupDao = sqlSession.getMapper(MilitaryGroupDao.class);
		return militaryGroupDao.get(id);
	}

	@Override
	public int insert(MilitaryGroup militaryGroup) {
		MilitaryGroupDao militaryGroupDao = sqlSession.getMapper(MilitaryGroupDao.class);
		return militaryGroupDao.insert(militaryGroup);
	}

	@Override
	public List<MilitaryGroup> getList() {
		MilitaryGroupDao militaryGroupDao = sqlSession.getMapper(MilitaryGroupDao.class);
		return militaryGroupDao.getList();
	}

}
