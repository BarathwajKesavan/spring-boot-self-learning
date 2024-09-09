package com.prasad.spring.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentPersonDAO {
	
	@Autowired
	ComponentJdbcConnection jdbcConnection;

	public ComponentPersonDAO(ComponentJdbcConnection jdbcConnection) {
		super();
		this.jdbcConnection = jdbcConnection;
	}

	public ComponentJdbcConnection getComponentJdbcConnection() {
		return jdbcConnection;
	}

	public void setComponentJdbcConnection (ComponentJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	

}
