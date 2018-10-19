package com.blindproject.blind.dao;

import java.util.List;

import com.blindproject.blind.entity.Classes;
import com.blindproject.blind.entity.Discharge;

public interface DischargeDao {
	
	Discharge get(Integer id);
	int insert(Discharge discharge);
	List<Discharge> getList();
}
