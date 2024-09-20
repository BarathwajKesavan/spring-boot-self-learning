package com.prasad.spring.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.prasad.spring.cdi.SomeCDIBusiness;

@Configuration
@ComponentScan("com.prasad.spring.cdi")
public class SpringCDIApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringCDIApplication.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new AnnotationConfigApplicationContext(SpringCDIApplication.class);
		SomeCDIBusiness business = context.getBean(SomeCDIBusiness.class);
		logger.info("{}  dao {}",business,business.getDao());
		
	}

}
