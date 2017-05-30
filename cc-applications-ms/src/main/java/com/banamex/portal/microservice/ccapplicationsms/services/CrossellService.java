package com.banamex.portal.microservice.ccapplicationsms.services;

import com.banamex.portal.microservice.ccapplications.domain.CrossellEntity;

public interface CrossellService {
	 
	  /*
	   * Métodos que raliza llamados a la base de datos( llamado a microservicio)
	   */
	  public CrossellEntity getClienteByFolio(String nFolio);
	  public CrossellEntity getClienteByNumCte(Long cTe);

//	  public CrossellEntity obtenerCLienteByNumCte(Long numCte);
//      public CrossellEntity obtenerCrosselByFolio(String folio);
    
    //Datos directos para el 16
//    public Hashtable<String, Object>   geNumCteSistema16(String CtaNum);
//	public Hashtable<String, Object>   geDataSistema16(String CtaNum);
//    public boolean eliminaRegistro();
}