package com.banamex.portal.microservice.ccapplicationsms.callswitch.impl;

import java.util.HashMap;
import java.util.Hashtable;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.banamex.portal.microservice.ccapplicationsms.callswitch.S016SystemMs;

public class S016SystemMsImpl implements S016SystemMs{
	
	/*
	 * Todos los llamados al microServicio S016 Datos Clientes
	 */
	
	public static HashMap<String,Object> beanDatosNCte = new HashMap<String,Object>();

	
	@Override
	public Hashtable<String, Object>  geDataSistema16(String nclient){
		Hashtable<String, Object> datosPre = new Hashtable<String, Object>();
		  
		 beanDatosNCte.put("numCSI", "10");
		 beanDatosNCte.put("tipoModal", "39");
		 beanDatosNCte.put("servNum", "15");
		 beanDatosNCte.put("servTipo", "51"); 
		 beanDatosNCte.put("num_cte", nclient);
		
		 /*
		  * DESCOMENTAR Se realiza el llamado a CIAdapterService-0.0.1-SNAPSHOT.jar,
		  * a su vez este archivo jar realiza llamados a c617_580-0.0.1.jar que es  
		  * el jar que obtiene informacion del cliente(consulta el sistema S016). 
		  */
		 /*
		Hashtable bufferInNCte = ExecuteServiceCIAdapter.getDataSendService(beanDatosNCte,"BEL_CnDGCteSS");
		
		Hashtable bufferOutNCte=new Hashtable<Object, Object>();
		datosPre = ExecuteServiceCIAdapter.executeService("BEL_CnDGCteSS", bufferInNCte, bufferOutNCte);
		*/
		
		return datosPre;
		
	}
	
	
	@FeignClient(name = "ccS016eMs")
	public interface DatabaseMicroServiceClient {
		
		@RequestMapping(value = "/getResultService", method = RequestMethod.POST, produces = "application/json")
		public  HashMap<String, Object> getResultQuery(@RequestBody HashMap<String, Object> datos);
		
	}

}
