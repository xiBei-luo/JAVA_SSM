package com.yc.service;

import com.yc.model.ExpertModel;


public interface ExpertService {
	void update();
	ExpertModel findById(int uid);
}
