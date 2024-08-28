package com.prasad.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
	
	@Autowired
	JdbcConnection jdbcConnection;

	public PersonDAO(JdbcConnection jdbcConnection) {
		super();
		this.jdbcConnection = jdbcConnection;
	}

	public JdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	

}
