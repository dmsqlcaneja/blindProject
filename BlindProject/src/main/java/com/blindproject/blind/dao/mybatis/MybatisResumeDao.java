package com.blindproject.blind.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.blindproject.blind.dao.ResumeDao;
import com.blindproject.blind.entity.Resume;

@Repository
public class MybatisResumeDao implements ResumeDao {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertResume(Resume resume) {
		ResumeDao resumeDao = sqlSession.getMapper(ResumeDao.class);
		return resumeDao.insertResume(resume);
	}

	@Override
	public int getId(Resume resume) {
		ResumeDao resumeDao = sqlSession.getMapper(ResumeDao.class);
		return resumeDao.getId(resume);
	}
	
}
