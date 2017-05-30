package com.banamex.portal.microservice.ccapplicationsms.repository;

import com.banamex.portal.microservice.ccapplications.domain.CrossellEntity;

public interface CrossellRepository { 
 	 public CrossellEntity obtenerCLienteByNumCte(Long numCte);
     public CrossellEntity obtenerCrosselByFolio(String folio); 
}