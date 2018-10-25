package com.blindproject.blind.dao;

import com.blindproject.blind.entity.Resume;

public interface ResumeDao {
	int insertResume(Resume resume);

	int getId(Resume resume);
}
