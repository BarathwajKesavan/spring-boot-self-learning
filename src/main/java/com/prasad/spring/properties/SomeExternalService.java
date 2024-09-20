package com.prasad.spring.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {
	
	@Value("${external.http.url}")
	private String uRL;
	
	public String returnURL() {
		return this.uRL;
	}
}
