package com.prasad.spring.properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringPropertyFileApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (SpringPropertyFileApplication.class);
		SomeExternalService service = context.getBean(SomeExternalService.class);
		System.out.println(service.returnURL());
		
	}
}
