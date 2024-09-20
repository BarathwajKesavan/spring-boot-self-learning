package com.barath.springgoals.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barath.springgoals.aop.dao.DAO1;

@Service
public class Business1 {
	@Autowired
	DAO1 dao1;
	public String calculateSomething() {
		return dao1.retrieveSomething();
	}
}
