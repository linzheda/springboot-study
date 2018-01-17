package com.yc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.entity.Student;
import com.yc.mapper.test1.Test1Mapper;
import com.yc.mapper.test2.Test2Mapper;

@RestController
public class StudentController {
	
	@Autowired
	private Test1Mapper test1Mapper;
	@Autowired
	private Test2Mapper test2Mapper;

	@RequestMapping("/getStudent")
	public List<Student> getStudent1() {
		List<Student> users=test1Mapper.getAll();
		return users;
	}
	
	
	@RequestMapping("/getStudent2")
	public List<Student> getStudent2() {
		List<Student> users=test2Mapper.getAll();
		return users;
	}
}
