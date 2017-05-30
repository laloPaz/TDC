package com.banamex.portal.microservice.ccapplicationsms.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.banamex.portal.microservice.ccapplications.domain.CrossellEntity;
import com.banamex.portal.microservice.ccapplicationsms.repository.CrossellRepository;
import com.banamex.portal.microservice.ccapplicationsms.services.CrossellService;

public class CrossellServiceImpl implements CrossellService{
	
	
	@Autowired 
	CrossellRepository  crossellRepository;
	
	
	@Override
	public CrossellEntity getClienteByFolio(String nFolio) {
		return crossellRepository.obtenerCrosselByFolio(nFolio);
	}

	@Override
	public CrossellEntity getClienteByNumCte(Long cTe) {
		return crossellRepository.obtenerCLienteByNumCte(cTe);
	}

}
