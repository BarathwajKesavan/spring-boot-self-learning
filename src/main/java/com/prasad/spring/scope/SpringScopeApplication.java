package com.prasad.spring.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.prasad.spring.componentscan.ComponentPersonDAO;

@Configuration
@ComponentScan("com.prasad.spring")
public class SpringScopeApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringScopeApplication.class);
	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringScopeApplication.class);
		
		PersonDAO personDAO = appContext.getBean(PersonDAO.class);
		logger.info("{}",personDAO);
		logger.info("{}",personDAO.getJdbcConnection());
		logger.info("{}",personDAO.getJdbcConnection());
		PersonDAO personDAO2 = appContext.getBean(PersonDAO.class);
		logger.info("{}",personDAO2);
		logger.info("{}",personDAO2.getJdbcConnection());
	
		
	}

}