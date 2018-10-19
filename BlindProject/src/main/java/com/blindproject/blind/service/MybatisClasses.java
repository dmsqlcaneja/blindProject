package com.blindproject.blind.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.blindproject.blind.dao.ClassesDao;
import com.blindproject.blind.entity.Classes;

public class MybatisClasses implements ClassesService {

	@Autowired ClassesDao classesDao;
	
	@Override
	public int insertClasses(Classes classes) {
		// TODO Auto-generated method stub
		return classesDao.insert(classes);
	}

}
