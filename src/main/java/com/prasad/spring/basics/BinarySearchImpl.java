package com.prasad.spring.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	
	
	
	/*public BinarySearchImpl(SortAlgorithm sortAlg) {
		super();
		this.sortAlg = sortAlg;
	}*/



	/*public void setSortAlg(SortAlgorithm sortAlg) {
		this.sortAlg = sortAlg;
	}*/



	public int binarySearch(int[] numbers, int numberToSearchFor ) {
		int [] sortedNumber = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 3;
	}

}
