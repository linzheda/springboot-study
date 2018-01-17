package com.yc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.yc.biz.StudentBiz;

@Controller
public class StudentController {
	
	@Autowired//自动注入
	@Qualifier("studentBizImpl")//消除混淆
	private StudentBiz sb;
	
	@RequestMapping("/findAll.action")
	public @ResponseBody String findAll() {
		System.out.println("666");
		Gson gson=new Gson();
		return gson.toJson(this.sb.findAll());
	}
}
