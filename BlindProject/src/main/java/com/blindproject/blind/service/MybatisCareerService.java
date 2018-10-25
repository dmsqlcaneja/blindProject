package com.blindproject.blind.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blindproject.blind.dao.CareerDao;
import com.blindproject.blind.entity.Career;

@Service
public class MybatisCareerService {

	@Autowired 
	private CareerDao careerDao;
	
	public int insertCareer(Career career) {
		// TODO Auto-generated method stub
		return careerDao.insertCareer(career);
	}

}
