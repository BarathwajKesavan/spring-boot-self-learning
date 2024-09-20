package com.barath.springgoals.aop.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DAO1 {
	public String retrieveSomething() {
		return("DAO1");
	}
}
