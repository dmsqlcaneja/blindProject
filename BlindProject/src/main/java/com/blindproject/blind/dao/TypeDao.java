package com.blindproject.blind.dao;

import java.util.List;

import com.blindproject.blind.entity.Company;
import com.blindproject.blind.entity.Type;

public interface TypeDao {
	
	Type get(Integer id);
	
	List<Type> getList();

}
