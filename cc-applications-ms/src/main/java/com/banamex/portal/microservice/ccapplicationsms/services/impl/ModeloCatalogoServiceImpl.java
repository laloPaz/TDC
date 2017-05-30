package com.banamex.portal.microservice.ccapplicationsms.services.impl;

import java.util.HashMap;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.banamex.portal.microservice.ccapplicationsms.callswitch.S080SystemMs;
import com.banamex.portal.microservice.ccapplicationsms.repository.CPRepository;
import com.banamex.portal.microservice.ccapplicationsms.services.ModeloCatalogoService;
import com.banamex.portal.microservice.ccapplicationsms.util.CatalogosStatic;
import com.banamex.portal.microservice.ccapplicationsms.util.ConstantesSTC;
import com.banamex.portal.microservice.ccapplicationsms.util.GsonR;
import com.banamex.portal.microservice.ccapplicationsms.util.Label;
import com.banamex.portal.microservice.ccapplicationsms.util.Messages;

public class ModeloCatalogoServiceImpl implements ModeloCatalogoService{

	
	@Autowired
	CPRepository cpRepo; 
	
	@Autowired
	S080SystemMs s080SystemService;

	private static Logger log = Logger.getLogger(ModeloCatalogoServiceImpl.class);
			
	/*
	 * Realizar un llamado a la base de datos
	 */
	public HashMap<String, Object> getEstadoDelegacionColonia(HashMap<String, Object> parametros) {
		Properties mensaje= Messages.es;
			
		log.debug("datos completos del request");
		log.debug(GsonR.toJson(parametros));
			
		HashMap<String, Object> rest = new HashMap<String, Object>();
		rest.put(Label.L_success,false);
		 	
		String cp = (String) ((parametros.get("cp")!=null) ? parametros.get("cp") : "");
			
		if(!cp.equals("")){
			try {
				rest.put(Label.L_datos,cpRepo.getEstadoDelegacionColonia(cp) );
				rest.put(Label.L_success,true);
			} catch (Exception e) {
				log.error("Exception getCodigosPostalesByCP ", e);
				rest.put(Label.L_success,false);
				rest.put(Label.L_codigo_error,ConstantesSTC.ERROR_AL_OBTENER_LOS_DATOS_EN_BASE);
			} 
		}else{
			rest.put(Label.L_success, false);
			rest.put(Label.L_codigo_error,ConstantesSTC.ERROR_VALIDACION_INCORRECTA_DE_DATOS);
			rest.put("cp", mensaje.getProperty("message.validDato.required"));
		}
			
		return rest;
	}

	/*
	 * Realizar un llamado al sistema S080
	 */
	public HashMap<String, Object> getEstadoDelegacionColonia20(HashMap<String, Object> parametros) {
		log.debug("datos completos del request");
		log.debug(GsonR.toJson(parametros));	 
	
		return s080SystemService.getEstadoDelegacionColoniaCatalog(parametros);
	}
		
	/*
	 * Realizar un llamado al sistema S080
	 */
	public HashMap<String, String> getPaises(){
		return s080SystemService.getPaises();
	}

	public HashMap<String, Object> getCatalogosStatic() {
		log.info("CatalogosStatic.getcatalogos:");
		log.debug(CatalogosStatic.getcatalogos);
			
		HashMap<String, Object> rest = new HashMap<String, Object>();
		rest.put(Label.L_success,false);
			
		HashMap<String, Object> a =new  HashMap<String, Object> ();
		if(CatalogosStatic.getcatalogos==null){
			rest.put(Label.L_success,false);
			rest.put(Label.L_codigo_error,ConstantesSTC.ERROR_NO_SE_ENCONTRARON_DATOS);
			log.info("CatalogosStatic.getcatalogos is null");
		}else{
			rest.put(Label.L_success,true);
			rest.put(Label.L_datos,CatalogosStatic.getcatalogos);
		}
			
		return a;	
	}
}
