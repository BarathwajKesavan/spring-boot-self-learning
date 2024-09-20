package com.prasad.spring.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringComponentScanApplicatoin {
	private static Logger logger = LoggerFactory.getLogger(SpringComponentScanApplicatoin.class);
	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringComponentScanApplicatoin.class);
		
		PersonDAO personDao = appContext.getBean(PersonDAO.class);
		PersonDAO personDao2 = appContext.getBean(PersonDAO.class);
		logger.info("{}",personDao);
		logger.info("{}",personDao.getJdbcConnection());
		logger.info("{}",personDao2);
		logger.info("{}",personDao2.getJdbcConnection());
		
	}

}

/*
package com.prasad.spring.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.prasad.spring.componentscan.ComponentPersonDAO;

@SpringBootApplication

public class SpringScopeApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringScopeApplication.class);
	public static void main(String[] args) {
		
		ApplicationContext appContext = SpringApplication.run(SpringScopeApplication.class, args);
		
		ComponentPersonDAO componentPersonDAO = appContext.getBean(ComponentPersonDAO.class);
		PersonDAO personDao2 = appContext.getBean(PersonDAO.class);
		logger.info("{}",componentPersonDAO);
		logger.info("{}",componentPersonDAO.getComponentJdbcConnection());
	
		
	}

}
*/