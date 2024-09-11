package com.prasad.spring.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.prasad.spring.cdi.SomeCDIBusiness;

@SpringBootApplication
public class SpringCDIApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringCDIApplication.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = SpringApplication.run(SpringCDIApplication.class,args);
		SomeCDIBusiness business = context.getBean(SomeCDIBusiness.class);
		logger.info("{}  dao {}",business,business.getDao());
		
	}

}
