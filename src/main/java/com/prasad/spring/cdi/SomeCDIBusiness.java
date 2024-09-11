package com.prasad.spring.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {
	@Inject
	private SomeCDIDAO dao;

	public SomeCDIDAO getDao() {
		return dao;
	}

	public void setDao(SomeCDIDAO dao) {
		this.dao = dao;
	}
	

}
