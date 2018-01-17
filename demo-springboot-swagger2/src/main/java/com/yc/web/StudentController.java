package com.yc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yc.entity.Student;
import com.yc.mapper.test1.Test1Mapper;
import com.yc.mapper.test2.Test2Mapper;

import io.swagger.annotations.ApiOperation;

@RestController
public class StudentController {
	
	@Autowired
	private Test1Mapper test1Mapper;
	@Autowired
	private Test2Mapper test2Mapper;

	
	
	@ApiOperation(value="获取test1的所有学生用户", notes="test1数据库")
	@RequestMapping(value="/getStudent",method=RequestMethod.GET)
	public List<Student> getStudent1() {
		List<Student> users=test1Mapper.getAll();
		return users;
	}
	
	@ApiOperation(value="获取test2的所有学生用户", notes="test2数据库")
	@RequestMapping(value="/getStudent2",method=RequestMethod.GET)
	public List<Student> getStudent2() {
		List<Student> users=test2Mapper.getAll();
		return users;
	}
}
