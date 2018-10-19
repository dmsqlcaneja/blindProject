package com.blindproject.blind.dao;

import java.util.List;

import com.blindproject.blind.entity.Classes;

public interface ClassesDao {
	
	Classes get(Integer id);
	int insert(Classes classes);
	List<Classes> getList();
}
