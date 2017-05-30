package com.banamex.portal.microservice.ccapplicationsms.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.banamex.portal.microservice.ccapplications.domain.TdcSecurityEntity;
import com.banamex.portal.microservice.ccapplicationsms.callswitch.DataBaseSystemMs;
import com.banamex.portal.microservice.ccapplicationsms.repository.TdcSecurityRepository;

public class TdcSecurityRepositoryImpl implements TdcSecurityRepository{

	@Autowired
	DataBaseSystemMs dataBaseSystemService;
	
	@Override
	public boolean insertTdcSecurity(TdcSecurityEntity ent) {
		return dataBaseSystemService.insertTdcSecurity(ent);
	}
	
	@Override
	public boolean pasaSecurity(String idUsuario) {
		return dataBaseSystemService.pasaSecurity(idUsuario);
	}

	@Override
	public String getMask(String idUsuario) {
		return dataBaseSystemService.getMask(idUsuario);
	}

	@Override
	public boolean eliminaRegistro() {
		return dataBaseSystemService.eliminaRegistro();
	}
		
}
