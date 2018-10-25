package com.blindproject.blind.dao;

import com.blindproject.blind.entity.Admin;

public interface AdminDao {

	int insertAdmin(Admin admin);

	Admin getAdmin(int id);

}
