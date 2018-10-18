package com.blindproject.blind.dao;

import java.util.List;

import com.blindproject.blind.entity.RecruitNotice;

public interface RecruitNoticeDao {
	
	int insert(RecruitNotice recruitNotice);

	int update(RecruitNotice recruitNotice);
	
	int delete(Integer id);
	
	RecruitNotice get(Integer id);
	
	List<RecruitNotice> getList();
	
	List<RecruitNotice> getList(String field, String query, int page);
	
}
