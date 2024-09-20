package com.prasad.spring.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prasad.spring.xml.XmlPersonDAO;

public class SpringIn5StepsXMLApplication {
	public static Logger logger = LoggerFactory.getLogger(SpringIn5StepsXMLApplication.class);
	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("application-context.xml")){
			XmlPersonDAO xmlPersonDAO= context.getBean(XmlPersonDAO.class);
			System.out.println(xmlPersonDAO);
			//System.out.println(xmlPersonDAO.getXmlJdbcConnection());
			System.out.println(xmlPersonDAO.getJdbcConnection());
			logger.info("{}",(Object) context.getBeanDefinitionNames() );
		};
		
	}
}
