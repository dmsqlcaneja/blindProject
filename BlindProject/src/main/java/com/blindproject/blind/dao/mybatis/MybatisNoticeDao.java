package com.blindproject.blind.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blindproject.blind.dao.NoticeDao;
import com.blindproject.blind.entity.Notice;

@Repository
public class MybatisNoticeDao implements NoticeDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertNotice(Notice notice) {
		
		NoticeDao noticeDao = sqlSession.getMapper(NoticeDao.class);
		
		return noticeDao.insertNotice(notice);
	}

}
