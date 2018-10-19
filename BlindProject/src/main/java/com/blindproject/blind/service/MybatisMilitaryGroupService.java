package com.blindproject.blind.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blindproject.blind.dao.MilitaryDao;
import com.blindproject.blind.dao.MilitaryGroupDao;
import com.blindproject.blind.entity.MilitaryGroup;

@Service
public class MybatisMilitaryGroupService implements MilitrayGroupService {
	
	@Autowired
	private MilitaryGroupDao militaryGroupDao; 

	@Override
	public int insertMilitaryGroup(MilitaryGroup militraygroup) {
		// TODO Auto-generated method stub
		return  militaryGroupDao.insert(militraygroup);
	}

}
