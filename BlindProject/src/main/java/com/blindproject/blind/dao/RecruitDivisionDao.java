package com.blindproject.blind.dao;

import java.util.List;

import com.blindproject.blind.entity.RecruitDivision;

public interface RecruitDivisionDao {

	RecruitDivision getRecruitDivision(int id);
	
	List<RecruitDivision> getRecruitDivisionList();
	
}
