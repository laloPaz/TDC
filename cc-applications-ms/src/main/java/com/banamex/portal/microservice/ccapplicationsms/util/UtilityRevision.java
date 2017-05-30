package com.banamex.portal.microservice.ccapplicationsms.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;

import com.banamex.portal.microservice.ccapplications.domain.InformacionClienteBean;

public class UtilityRevision {

	private static Logger log = Logger.getLogger(UtilityRevision.class);
	
	public static HashMap<String, Object> Regresafaltantes(InformacionClienteBean  infoCliente){
		     
		   HashMap<String,String> informacionPromotora = new HashMap<String,String>();
		   ArrayList informacionPersonal2 = new ArrayList();
		   ArrayList informacionLaboral2 = new ArrayList();
		   ArrayList informacionCrediticia2 = new ArrayList();
		   ArrayList informacionExtra2 =  new ArrayList();
		   ArrayList informacionPromotora2 = new ArrayList();
		
		   Iterator it = RequiredCamposBeanInfo.requiredInformacionPersonal.entrySet().iterator();
		   		while (it.hasNext()) {
		   			Map.Entry pairs = (Map.Entry)it.next();
			        String sigue=(String) pairs.getValue();
			        Boolean sigue2=Boolean.parseBoolean(sigue);
			        if(sigue2){
			        	if(!infoCliente.getInformacionPersonal().containsKey(pairs.getKey())){
			        		informacionPersonal2.add(pairs.getKey());
			        	}
			        }
			    }
		
		   		//------- si es nacionalidad mexicana pedirle entidad federativa
			    
		   		String nacionaliada =infoCliente.getInformacionPersonal().get("nacionalidad");
				
		   		if(nacionaliada!=null){
		   			log.debug("nacionaliada 16 : "+nacionaliada);
					
		   			if (nacionaliada.equals("1") ){
		   				informacionPersonal2.add("entidadFederativa");
					}
				 }
				 
		   		//-----------------------------------------
				log.debug("informacionPersonal2  : "+GsonR.toJson(informacionPersonal2));
				   
				Iterator it2 = RequiredCamposBeanInfo.requiredInformacionLaboral.entrySet().iterator();
			    while (it2.hasNext()) {
			        Map.Entry pairs = (Map.Entry)it2.next();
			        String sigue=(String) pairs.getValue();
			        Boolean sigue2=Boolean.parseBoolean(sigue);
			        if(sigue2){
			        	if(!infoCliente.getInformacionLaboral().containsKey(pairs.getKey())){
			        		informacionLaboral2.add(pairs.getKey());
			        	}
			        }
			    }
			    
			    Iterator it3 = RequiredCamposBeanInfo.requiredInformacionCrediticia.entrySet().iterator();
			    while (it3.hasNext()) {
			        Map.Entry pairs = (Map.Entry)it3.next();
			        String sigue=(String) pairs.getValue();
			        Boolean sigue2=Boolean.parseBoolean(sigue);
			        if(sigue2){
			        	if(!infoCliente.getInformacionCrediticia().containsKey(pairs.getKey())){
			        		informacionCrediticia2.add(pairs.getKey());
			        	}
			        }
			    }
			    
			    Iterator it4 = RequiredCamposBeanInfo.requiredInformacionExtra.entrySet().iterator();
			    while (it4.hasNext()) {
			        Map.Entry pairs = (Map.Entry)it4.next();
			        String sigue=(String) pairs.getValue();
			        Boolean sigue2=Boolean.parseBoolean(sigue);
			        if(sigue2){
			        	if(!infoCliente.getInformacionExtra().containsKey(pairs.getKey())){
			        		informacionExtra2.add(pairs.getKey());
			        	}
			        }
			    }
			     
			    HashMap<String, Object> devolver = new HashMap<String, Object>();
			    
			    devolver.put("informacionPersonal", informacionPersonal2);
			    devolver.put("informacionLaboral", informacionLaboral2);
			    devolver.put("informacionCrediticia", informacionCrediticia2);
			    devolver.put("informacionExtra", informacionExtra2);
			   
			    
			    log.debug("Variables faltantes" + devolver);
		  
		   return devolver;
	   }
	 
	static public String getTarjeta_Format(String tarjeta){
		 String Format="";
				 
         if(tarjeta.length()<2)
             tarjeta="000"+tarjeta;
         else if(tarjeta.length()<3)
             tarjeta="00"+tarjeta;
         else if(tarjeta.length()<4)
             tarjeta="0"+tarjeta;
         Format = tarjeta;
         return Format;
	}
}
