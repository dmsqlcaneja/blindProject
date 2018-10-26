package com.blindproject.blind.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blindproject.blind.dao.ApplyDao;
import com.blindproject.blind.dao.CareerDao;
import com.blindproject.blind.dao.ResumeDao;
import com.blindproject.blind.entity.Apply;
import com.blindproject.blind.entity.Career;
import com.blindproject.blind.entity.Resume;


@Service
public class ApplyService {

	@Autowired 
	private ResumeDao resumeDao;
	@Autowired
	private CareerDao careerDao;
	@Autowired
	private ApplyDao applyDao;

	@Transactional
	public int insertResume(Resume resume, Career career, Apply apply) {
		applyDao.insertApply(apply); // 1. insert 
		int applyId = applyDao.getId(apply);
		resume.setApplyId(applyId);
		resumeDao.insertResume(resume);
		
		resume.setApplierId(1); // 이거는 진짜 회원 아이디를 넣어야 함, 로그인 하면 세션이 회원 정보가 담겨지니까 나중에 하세요!!
		int resumeId = resumeDao.getId(resume);
		career.setResumeId(resumeId);
		return careerDao.insertCareer(career);
	}


/*	public int insertCareer(Career career) {
		
		
		return careerDao.insertCareer(career);
	}
*/
}
