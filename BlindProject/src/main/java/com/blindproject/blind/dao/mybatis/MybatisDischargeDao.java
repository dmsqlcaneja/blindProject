package com.blindproject.blind.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blindproject.blind.dao.ClassesDao;
import com.blindproject.blind.dao.DischargeDao;
import com.blindproject.blind.entity.Discharge;

@Repository
public class MybatisDischargeDao implements DischargeDao{
	
	@Autowired
	private SqlSession sqlSession;
	@Override
	public Discharge get(Integer id) {
		DischargeDao dischargeDao = sqlSession.getMapper(DischargeDao.class);
		return dischargeDao.get(id);
		
	}
	@Override
	public int insert(Discharge discharge) {
		DischargeDao dischargeDao = sqlSession.getMapper(DischargeDao.class);
		return dischargeDao.insert(discharge);
	}
	@Override
	public List<Discharge> getList() {
		DischargeDao dischargeDao = sqlSession.getMapper(DischargeDao.class);
		return dischargeDao.getList();
	}
	
	
	
	}
