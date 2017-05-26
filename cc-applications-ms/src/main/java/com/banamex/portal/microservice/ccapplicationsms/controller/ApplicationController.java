package com.banamex.portal.microservice.ccapplicationsms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("applications")
public class ApplicationController {

	private final Logger log = LoggerFactory.getLogger(ApplicationController.class);

	/*
	 * Devuelve la informacion faltante de cliente para una solicitud utilizando el
	 * número y fecha de nacimiento del cliente
	 */
	@RequestMapping(value = "/customer",method = RequestMethod.POST, produces="application/json")
	public Object getInfCustumerToRequestCreditCardByNumClientAndBirthday() {
		log.info("Obteniendo informacion del cliente para realizar solicitud de TDC");
		
		/*
		 * numClient
		 * birthDate
		 */
		return null;
	}
	
	/*
	 * Devuelve la informacion faltante de cliente para una solicitud
	 */
	@RequestMapping(value = "/customer/{folioXSell}",method = RequestMethod.GET, produces="application/json")
	public Object getInfCustumerToRequestCreditCardByFolioXSell(@PathVariable String folioXSell) {
		log.info("Obteniendo informacion del cliente para realizar solicitud de TDC");

		return null;
	}
	
	/*
	 * Devuelve la informacion de una solicitud por folio, celular y mail
	 */
	@RequestMapping(value = "/requestCreditCard",method = RequestMethod.POST, produces="application/json")
	public Object getInfRequest() {
		log.info("Obteniendo informacion de una solicitud TDC");

		/*
		 * folioDB
		 * celPhone
		 * email
		 */
		return null;
	}
	
	/*
	 * Devuelve un mensaje encriptado que se enviara a KIO desde FRONT
	 */
	@RequestMapping(value = "/requestCreditCardKio",method = RequestMethod.POST, produces="application/json")
	public Object getInfRequestKio() {
		log.info("Obteniendo informacion del mensaje encriptado que se enviara a KIO");

		/*
		 * folioDB
		 * celPhone
		 * email
		 * OTP
		 */
		return null;
	}
	
	/*
	 * Crear una nueva solicitud setDataCredit
	 */
	@RequestMapping(value = "/",method = RequestMethod.POST, produces="application/json")
	public Object createRequestCreditCard() {
		log.info("Creando una nueva solicitud de TDC");

		return null;
	}
	
	/*
	 * Actualizar una solicitud setDataCredit
	 */
	@RequestMapping(value = "/{idRequestCreditCard}",method = RequestMethod.PUT, produces="application/json")
	public Object updateRequestCreditCard(@PathVariable Integer idRequestCreditCard) {
		log.info("Actualizando una solicitud de TDC");

		return null;
	}
	
	/*
	 * Devuelve el estatus y escenario de una solicitud
	 */
	@RequestMapping(value = "/status/{folioCI}",method = RequestMethod.GET, produces="application/json")
	public Object getStatusRequestCreditCard(@PathVariable Integer folioCI) {
		log.info("Obteniendo el estatus de una solicitud TDC");
		return null;
	}
	
	/*
	 * Procesar la petición de solicitud de tarjeta de credito
	 */
	@RequestMapping(value = "/proces/{folioBD}",method = RequestMethod.GET, produces="application/json")
	public Object processRequestCreditCard(@PathVariable Integer folioBD) {
		log.info("Procesando la peticion de TDC");

		
		return null;
	}
	
//	private void generarArratTemporal(Integer [] arrayTemp,Integer [] array,int indice, int tam){
//		arrayTemp = new Integer[tam];	
//		int limite = indice + tam;
//		for(int i=indice;i<limite;i++){
//			arrayTemp [i] = array[i];
//		}
//	}
	
//	private void call(Integer [] array){
//	
//		Integer [] array1 = new Integer[1500]; 
//		
//		int cantidadLlamados = array1.length/1000;
//		int rest = array1.length % 1000;
//		int nTem = 0;
//		Integer [] arrayTemp = null;	
//		
//		for(int i=0;i<cantidadLlamados;i++){
//			generarArratTemporal(arrayTemp,array1,nTem,1000);
//			call(arrayTemp);
//			nTem += 1000;
//		}
//			
//		if(rest >0){
//			generarArratTemporal(arrayTemp,array1,cantidadLlamados*1000, rest);
//			call(arrayTemp);
//		}
//
//	}
	
	
}
