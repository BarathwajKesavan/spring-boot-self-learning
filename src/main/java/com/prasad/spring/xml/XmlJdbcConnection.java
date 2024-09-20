package com.prasad.spring.xml;

import org.springframework.stereotype.Component;

@Component
public class XmlJdbcConnection {

	public XmlJdbcConnection() {
		super();
		System.out.println("JDBC Connection");
	}

	
}
