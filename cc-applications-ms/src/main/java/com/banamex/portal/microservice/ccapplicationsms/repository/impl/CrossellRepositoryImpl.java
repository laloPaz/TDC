package com.banamex.portal.microservice.ccapplicationsms.repository.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.banamex.portal.microservice.ccapplications.domain.CrossellEntity;
import com.banamex.portal.microservice.ccapplicationsms.callswitch.DataBaseSystemMs;
import com.banamex.portal.microservice.ccapplicationsms.repository.CrossellRepository;


public class CrossellRepositoryImpl implements CrossellRepository{

	private static Logger log = Logger.getLogger(CrossellRepositoryImpl.class);

	@Autowired 
	DataBaseSystemMs dataBaseSystemService;
	
	@Override
	public CrossellEntity obtenerCLienteByNumCte(Long numCte) {
		return dataBaseSystemService.obtenerCLienteByNumCte(numCte);
	}

	@Override
	public CrossellEntity obtenerCrosselByFolio(String folio) {
		return dataBaseSystemService.obtenerCrosselByFolio(folio);
	}
	
	

}
