package com.blindproject.blind.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blindproject.blind.dao.RecruitNoticeDao;
import com.blindproject.blind.dao.SinEmployeeDao;
import com.blindproject.blind.entity.RecruitNotice;

@Repository
public class MybatisRecruitNoticeDao implements RecruitNoticeDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public RecruitNotice get(Integer id) {
		
		RecruitNoticeDao recruitNoticeDao = sqlSession.getMapper(RecruitNoticeDao.class);
		
		return recruitNoticeDao.get(id);
	}

	@Override
	public List<RecruitNotice> getList() {
	
		RecruitNoticeDao recruitNoticeDao = sqlSession.getMapper(RecruitNoticeDao.class);
		
		return recruitNoticeDao.getList("id", "", 1);
	}

	@Override
	public List<RecruitNotice> getList(String field, String query, int page) {
		
		RecruitNoticeDao recruitNoticeDao = sqlSession.getMapper(RecruitNoticeDao.class);
		
		return recruitNoticeDao.getList(field, query, page);
	}

}
