package com.blindproject.blind.dao;

import java.util.List;

import com.blindproject.blind.entity.MilitaryGroup;

public interface MilitaryGroupDao {

	MilitaryGroup get(Integer id);

	int insert(MilitaryGroup militaryGroup);

	List<MilitaryGroup> getList();
}
