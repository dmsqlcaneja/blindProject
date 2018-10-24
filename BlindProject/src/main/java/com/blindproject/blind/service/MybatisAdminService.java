package com.blindproject.blind.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blindproject.blind.dao.NoticeDao;
import com.blindproject.blind.entity.Notice;

@Service
public class MybatisAdminService implements AdminService {

	@Autowired
	private NoticeDao noticeDao;
	
	public int insertNotice(Notice notice) {
		// TODO Auto-generated method stub
		return noticeDao.insertNotice(notice);
	}
	
	
}
