package com.banamex.portal.microservice.ccapplicationsms.services.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;

import com.banamex.portal.microservice.ccapplicationsms.repository.ApplicationRepository;
import com.banamex.portal.microservice.ccapplicationsms.services.ApplicationService;

public class ApplicationServiceImpl implements ApplicationService {

	@Autowired 
	ApplicationRepository applicationRepository;
	
	
	@Override
	public HashMap<String, Object> getSys16(String nclient) {
		return applicationRepository.getSys16(nclient);
	}

	@Override
	public HashMap<String, Object> getSys16Compuesto(String nclient, String fechanacimiento) {
		return applicationRepository.getSys16Compuesto(nclient, fechanacimiento);
	}

}
