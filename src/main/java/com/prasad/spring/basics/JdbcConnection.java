package com.prasad.spring.basics;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {

	public JdbcConnection() {
		super();
		System.out.println("JDBC Connection");
	}

	
}
