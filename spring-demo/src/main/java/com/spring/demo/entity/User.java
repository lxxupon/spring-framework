package com.spring.demo.entity;

public class User {

	private String name;

	public void sayHello(){
		System.out.println(name+":say hello...........");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
