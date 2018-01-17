package com.yc.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String sex;
	private String remark;
	private Integer age;
	
}
