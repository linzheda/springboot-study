package com.yc.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yc.bean.Student;
import com.yc.biz.StudentBiz;
import com.yc.dao.BaseDao;



@Service
public class StudentBizImpl implements StudentBiz{
	
	@Autowired
	@Qualifier("baseDaoImpl")
	private BaseDao db;
	
	
	@Override
	public List<Student> findAll() {
		return this.db.findAll(new Student(), "findAll");
	}
	
}
