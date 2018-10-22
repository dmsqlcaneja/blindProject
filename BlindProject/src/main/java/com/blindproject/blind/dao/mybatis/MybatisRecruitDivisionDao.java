package com.blindproject.blind.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blindproject.blind.dao.RecruitDivisionDao;
import com.blindproject.blind.entity.RecruitDivision;

@Repository
public class MybatisRecruitDivisionDao implements RecruitDivisionDao {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public RecruitDivision get(Integer id) {

		RecruitDivisionDao recruitDivisionDao = sqlSession.getMapper(RecruitDivisionDao.class);

		return recruitDivisionDao.get(id);

	}

	@Override
	public List<RecruitDivision> getRecruitDivisionList() {

		RecruitDivisionDao recruitDivisionDao = sqlSession.getMapper(RecruitDivisionDao.class);

		return recruitDivisionDao.getRecruitDivisionList();
	}

}
