package com.blindproject.blind.dao;

import java.util.List;

import com.blindproject.blind.entity.RecruitDivision;

public interface RecruitDivisionDao {

	RecruitDivision get(Integer id);
	
	List<RecruitDivision> getList();
	
}
