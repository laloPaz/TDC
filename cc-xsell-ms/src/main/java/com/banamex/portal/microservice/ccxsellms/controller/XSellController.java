package com.banamex.portal.microservice.ccxsellms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domains")
public class XSellController {
	
	private final Logger log = LoggerFactory.getLogger(XSellController.class);
	
	/*
	 * Obtener todos los dominios CrossSell
	 */
	@RequestMapping(value = "/",method = RequestMethod.GET, produces="application/json")
	public Object getAllDomainsXSell() {
		log.info("Obtener los dominios que son permitidos para XSell");
		return null;
	}
	
	/*
	 * Obtener todos los dominios por estatus
	 */
	@RequestMapping(value = "/{status}",method = RequestMethod.GET, produces="application/json")
	public Object getAllDomainsXSellByStatus(@PathVariable Integer status) {
		log.info("Obtener los dominios de XSell dependiendo de un estado determinado");
		return null;
	}
	
	/*
	 * Crear un dominio CrossSell
	 */
	@RequestMapping(value = "/",method = RequestMethod.POST, produces="application/json")
	public Object createDomainXSell() {
		log.info("Dar de alta un dominio que será permitido en XSell");
		return null;
	}
	
	/*
	 *  Actualizar un dominio CrossSell
	 */
	@RequestMapping(value = "/{soeId}",method = RequestMethod.PUT, produces="application/json")
	public Object updateDomainXSellBySoeid(@PathVariable String soeId) {
		log.info("Actualizar un dominio que esta permitido en XSell");
		return null;
	}
}
