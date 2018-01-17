package com.yc.biz;

import java.util.List;

import com.google.gson.JsonElement;
import com.yc.bean.Student;

public interface StudentBiz {

	public List<Student> findAll();
	
}
