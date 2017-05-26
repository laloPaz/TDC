package com.banamex.portal.microservice.ccxsellms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("")
public class UtilXSellController {

	private final Logger log = LoggerFactory.getLogger(UtilXSellController.class);

	/*
	 * Subllamado, para obtener promociones para el cliente y
	 * algunos datos del cliente
	 */
	@RequestMapping(value = "/offer/datClient/{folioXSell}",method = RequestMethod.GET, produces="application/json")
	public Object getInfPromosToCustumer(@PathVariable String folioXSell) {
		log.info("Obtener las promociones que pudiera tener un cliente, este metodo devuelve la informacion del cliente aun si no tiene asociada una promocion");
		return null;
	}
	
	/*
	 * Insertar lista de clientes CrossSell
	 */
	@RequestMapping(value = "/files/upload",method = RequestMethod.POST, produces="application/json")
	public Object insertListCustumerXSell() {
		log.info("Obtener las promociones que pudiera tener un cliente, este metodo devuelve la informacion del cliente aun si no tiene asociada una promocion");
		return null;
	}
}
