package com.prasad.spring.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class XmlPersonDAO {
	@Autowired
	XmlJdbcConnection jdbcConnection;

	public XmlJdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(XmlJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
//	public XmlJdbcConnection getXmlJdbcConnection() {
//		return XmlJdbcConnection;
//	}
//	public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
//		this.XmlJdbcConnection = xmlJdbcConnection;
//	}
	//Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	

}
