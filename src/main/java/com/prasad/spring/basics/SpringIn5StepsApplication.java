package com.prasad.spring.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@Configuration //automatically scans the package & sub package for beans
@ComponentScan
public class SpringIn5StepsApplication {
	private static Logger logger= LoggerFactory.getLogger(SpringIn5StepsApplication.class);
	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		//ApplicationContext appContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringIn5StepsApplication.class);
		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		BinarySearchImpl binarySearch1 = appContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch1);
		System.out.println(binarySearch.binarySearch(new int[] {12, 4, 6}, 3));
		logger.info("{}",binarySearch.getClass());
		logger.debug("test");
		
	}

}
