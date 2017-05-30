package com.banamex.portal.microservice.ccapplicationsms.repository;

import com.banamex.portal.microservice.ccapplications.domain.TdcSecurityEntity;

public interface TdcSecurityRepository {
	public boolean insertTdcSecurity(TdcSecurityEntity ent);
	public boolean pasaSecurity(String idUsuario);
	public String getMask(String idUsuario);
	public boolean eliminaRegistro();
}