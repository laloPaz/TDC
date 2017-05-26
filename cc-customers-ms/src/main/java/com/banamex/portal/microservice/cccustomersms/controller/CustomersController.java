package com.banamex.portal.microservice.cccustomersms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("S016")
public class CustomersController {
	
	private final Logger log = LoggerFactory.getLogger(CustomersController.class);

	/*
	 * Subllamado, para obtener los datos del cliente
	 */
	@RequestMapping(value = "/dataClient/{numClient}/{birthDate}",method = RequestMethod.GET, produces="application/json")
	public Object getInfCustumerByNumClientAndBirthday(@PathVariable Integer numClient,@PathVariable String birthDate) {
		log.info("Obtener informacion del cliente registrada en el sistema S016 a partir del numero y fecha de nacimiento del cliente");
		/*
		 * numClient
		 * birthDate
		 */
		return null;
	}
}
