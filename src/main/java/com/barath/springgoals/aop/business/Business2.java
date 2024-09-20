package com.barath.springgoals.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barath.springgoals.aop.dao.DAO2;

@Service
public class Business2 {
	@Autowired
	DAO2 dao2;
	public String calculateSomething() {
		return dao2.retrieveSomething();
	}
}
