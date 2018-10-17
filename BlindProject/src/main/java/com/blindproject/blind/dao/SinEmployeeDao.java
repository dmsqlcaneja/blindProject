package com.blindproject.blind.dao;

import com.blindproject.blind.entity.SinEmployee;

public interface SinEmployeeDao {
	
	SinEmployee get(Integer id);

	int insert(SinEmployee sinEmployee);
	
}
