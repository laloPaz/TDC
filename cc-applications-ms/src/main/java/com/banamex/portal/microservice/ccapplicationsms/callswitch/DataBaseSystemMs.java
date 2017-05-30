package com.banamex.portal.microservice.ccapplicationsms.callswitch;

import java.util.HashMap;

import com.banamex.portal.microservice.ccapplications.domain.CrossellEntity;
import com.banamex.portal.microservice.ccapplications.domain.TdcSecurityEntity;

public interface DataBaseSystemMs {

	/*
	 * TDC CrossellEntity
	 */
	public CrossellEntity obtenerCLienteByNumCte(Long numCte);
	public CrossellEntity obtenerCrosselByFolio(String folio) ;
	
	/*
	 * TDC DIRECCION 
	 */
	public HashMap<String, Object> getEstadoDelegacionColonia(String CP);
	
	/*
	 * TDC SECURITY
	 */
	public boolean insertTdcSecurity(TdcSecurityEntity ent);
	public boolean pasaSecurity(String idUsuario);
	public String getMask(String idUsuario);
	public boolean eliminaRegistro();
	
	
}
