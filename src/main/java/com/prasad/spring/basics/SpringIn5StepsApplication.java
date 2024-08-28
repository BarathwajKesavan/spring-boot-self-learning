package com.prasad.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication //automatically scans the package & sub package for beans
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		ApplicationContext appContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		BinarySearchImpl binarySearch1 = appContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch1);
		System.out.println(binarySearch.binarySearch(new int[] {12, 4, 6}, 3));
	}

}
