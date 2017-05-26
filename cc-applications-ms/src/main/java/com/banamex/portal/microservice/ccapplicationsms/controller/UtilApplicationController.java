package com.banamex.portal.microservice.ccapplicationsms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class UtilApplicationController {
	
	private final Logger log = LoggerFactory.getLogger(UtilApplicationController.class);

	/*
	 * Devuelve un mensaje encriptado que se enviara a KIO desde FRONT
	 */
	@RequestMapping(value = "/message/encript",method = RequestMethod.POST, produces="application/json")
	public Object getMessageEncriptToSendToKIO() {
		log.info("Obteniendo mensaje encriptado que se enviara a KIO");

		return null;
	}
	
	/*
	 * Devuelve el Estado, Delegacion y Colonia de un codigo postal
	 */
	@RequestMapping(value = "/neighborhoods/{cp}",method = RequestMethod.GET, produces="application/json")
	public Object getInfNeighborhoodsByCodePost(@PathVariable String cp) {
		log.info("Obteniendo informacion del estado, delegacion y colonia a partir del CP");

		return null;
	}
	
	/* 
	 * Obtiene una lista de paises
	 */
	@RequestMapping(value = "/countries",method = RequestMethod.GET, produces="application/json")
	public Object getInfCountries() {
		log.info("Obteniendo informacion de paises");

		return null;
	}
	
	
	
}
