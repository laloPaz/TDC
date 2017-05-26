package com.banamex.portal.microservice.ccbureaums.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("buro")
public class BureauController {

	private final Logger log = LoggerFactory.getLogger(BureauController.class);

	/*
	 * Subllamado, url no expuesta para obtener la situcación del cliente ante
	 * buro(acreditado/no acreditado)
	 */
	@RequestMapping(value = "/acrreditation",method = RequestMethod.GET, produces="application/json")
	public Object getInfCustumerToRequestCreditCardByNumClientAndBirthday() {
		log.info("Obteniendo informacion de buro de credito para conocer si un cliente es o no acreditado");
		return null;
	}
	
	
}
