package com.banamex.portal.microservice.cccims.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("")
public class CIController {

	private final Logger log = LoggerFactory.getLogger(CIController.class);

	/*
	 * Subllamado, url no expuesta para agregar datos de un 
	 * cliente a una tarjeta de credito
	 */
	@RequestMapping(value = "/addCreditCard",method = RequestMethod.POST, produces="application/json")
	public Object addCreditCard() {
		log.info("Asociando informacion de un cliente a la solicitud de una tarjeta de credito");
		return null;
	}
	
	/*
	 * Subllamado, url no expuesta para obtener el estatus 
	 * de una tarjeta de credito(ejemplos Denegada, Proceso, etc)
	 */
	@RequestMapping(value = "/status/{folioCI}",method = RequestMethod.GET, produces="application/json")
	public Object getInfStatusCreditCard() {
		log.info("Obtener el estatus acerca de una TDC por ejemplo rechazado, proceso, etc");
		return null;
	}
}
