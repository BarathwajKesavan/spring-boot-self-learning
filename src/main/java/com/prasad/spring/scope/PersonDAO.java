package com.prasad.spring.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {
	
	@Autowired
	JdbcConnection jdbcConnection;
	Logger logger = LoggerFactory.getLogger(this.getClass());
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
	 
	@PostConstruct
	public void postConstruct() {
		logger.info("post construct");
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("pre destroy");
	}
	
	

}
