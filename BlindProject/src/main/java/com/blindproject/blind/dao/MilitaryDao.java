package com.blindproject.blind.dao;

import java.util.List;

import com.blindproject.blind.entity.Military;

public interface MilitaryDao {
	
	Military get(Integer id);
	
	List<Military> getList();
}
