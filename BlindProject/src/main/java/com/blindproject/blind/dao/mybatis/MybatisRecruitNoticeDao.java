package com.blindproject.blind.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blindproject.blind.dao.RecruitNoticeDao;
import com.blindproject.blind.dao.EmployeeDao;
import com.blindproject.blind.entity.RecruitNotice;

@Repository
public class MybatisRecruitNoticeDao implements RecruitNoticeDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertRecruitNotice(RecruitNotice recruitNotice) {
		
		RecruitNoticeDao recruitNoticeDao = sqlSession.getMapper(RecruitNoticeDao.class);
		
		return recruitNoticeDao.insertRecruitNotice(recruitNotice);
	}

	@Override
	public int update(RecruitNotice recruitNotice) {
		
		RecruitNoticeDao recruitNoticeDao = sqlSession.getMapper(RecruitNoticeDao.class);
		
		return recruitNoticeDao.update(recruitNotice);
	}

	@Override
	public int delete(Integer id) {
		
		RecruitNoticeDao recruitNoticeDao = sqlSession.getMapper(RecruitNoticeDao.class);
		
		return recruitNoticeDao.delete(id);
	}
	
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
	public List<RecruitNotice> getList(String field) {
		
		RecruitNoticeDao recruitNoticeDao = sqlSession.getMapper(RecruitNoticeDao.class);
		
		return recruitNoticeDao.getList(field, "", 1);
	}
	
	@Override
	public List<RecruitNotice> getList(String field, String query, int page) {
		
		RecruitNoticeDao recruitNoticeDao = sqlSession.getMapper(RecruitNoticeDao.class);
		
		return recruitNoticeDao.getList(field, query, page);
	}

}
