package com.banamex.portal.microservice.cccatalogsms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("callS080")
public class S080Controller {

	private final Logger log = LoggerFactory.getLogger(S080Controller.class);

	/*
	 * 
	 */
	@RequestMapping(value = "/dataStates",method = RequestMethod.GET, produces="application/json")
	public Object callSystemS080CatalogStates() {
		log.info("Obteniendo informacion del catalogo acerca de las entidades deferativas");
		return null;
	}

	
}
