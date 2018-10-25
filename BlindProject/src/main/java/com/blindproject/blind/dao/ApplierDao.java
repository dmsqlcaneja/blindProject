package com.blindproject.blind.dao;

import com.blindproject.blind.entity.Applier;

public interface ApplierDao {

	int insertApplier(Applier applier);

	Applier getApplier(int id);

}
