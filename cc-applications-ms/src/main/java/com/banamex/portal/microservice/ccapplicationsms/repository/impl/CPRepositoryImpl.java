package com.banamex.portal.microservice.ccapplicationsms.repository.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

import com.banamex.portal.microservice.ccapplicationsms.callswitch.DataBaseSystemMs;
import com.banamex.portal.microservice.ccapplicationsms.repository.CPRepository;

public class CPRepositoryImpl implements CPRepository {
	
	@Autowired
	DataBaseSystemMs dataBaseSystemService;

	@Override
	public HashMap<String, Object> getEstadoDelegacionColonia(String CP) {
		return dataBaseSystemService.getEstadoDelegacionColonia(CP);
	}

	
	
	
	
	
}
