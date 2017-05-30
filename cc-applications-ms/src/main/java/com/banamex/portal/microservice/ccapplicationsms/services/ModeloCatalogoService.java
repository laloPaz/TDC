package com.banamex.portal.microservice.ccapplicationsms.services;

import java.util.HashMap;

public interface ModeloCatalogoService {

	/*
	 * Método no realiza llamado a ningun microservicio
	 */
	public HashMap<String, Object> getCatalogosStatic();
	
	/*
	 * Métodos que consultan informacion de la base de datos (llamado a microservicio)
	 */
	public HashMap<String, Object> getEstadoDelegacionColonia(HashMap<String, Object> parametros);
	
	/*
	 * Métodos que consultan informacion del sistema S080 (llamado a microservicio)
	 */
	public HashMap<String, Object> getEstadoDelegacionColonia20(HashMap<String, Object> parametros);
	public HashMap<String,String>  getPaises();
	
	
}
