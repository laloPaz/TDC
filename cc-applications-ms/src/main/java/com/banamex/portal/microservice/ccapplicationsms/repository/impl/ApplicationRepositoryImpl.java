package com.banamex.portal.microservice.ccapplicationsms.repository.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.banamex.portal.microservice.ccapplications.domain.CrossellEntity;
import com.banamex.portal.microservice.ccapplications.domain.InformacionClienteBean;
import com.banamex.portal.microservice.ccapplications.domain.TdcSecurityEntity;
import com.banamex.portal.microservice.ccapplicationsms.callswitch.S016SystemMs;
import com.banamex.portal.microservice.ccapplicationsms.repository.ApplicationRepository;
import com.banamex.portal.microservice.ccapplicationsms.repository.TdcSecurityRepository;
import com.banamex.portal.microservice.ccapplicationsms.services.CrossellService;
import com.banamex.portal.microservice.ccapplicationsms.services.ModeloCatalogoService;
import com.banamex.portal.microservice.ccapplicationsms.services.impl.ModeloCatalogoServiceImpl;
import com.banamex.portal.microservice.ccapplicationsms.util.GsonR;
import com.banamex.portal.microservice.ccapplicationsms.util.UtilityRevision;

public class ApplicationRepositoryImpl implements ApplicationRepository{

	private static Logger log = Logger.getLogger(ApplicationRepositoryImpl.class);

	
	@Autowired
	 CrossellService crosselServ;
	
	@Autowired
	S016SystemMs s016SystemService;
	
	@Autowired
	TdcSecurityRepository tdcSecurityRepository;


	@Override
	public HashMap<String, Object> getSys16(String nclient) {
		
		return  null;
	}

	@Override
	public HashMap<String, Object> getSys16Compuesto(String nclient, String fechaNacimiento) {
		log.debug("getSys16Compuesto("+nclient+","+fechaNacimiento+")");
		HashMap<String, Object> datos =  getDatosSys16Cross(nclient);
		
		if( (Boolean)datos.get("es16")  == true && fechaNacimiento.equals(datos.get("fecha_nac"))&&fechaNacimiento.length()>0){ 
			log.debug("Validacion fecha recibida correcta");
			if(tdcSecurityRepository.pasaSecurity(nclient)){
				log.debug("Paso security");
				return datos;	 
			}else{
				log.debug("No paso security");
				HashMap<String, Object> res=new HashMap<>();
				return res;
			}
		}else{
			log.debug("Validacion fecha recibida incorrecta");
			TdcSecurityEntity secEntity=new TdcSecurityEntity();
			secEntity.setTdcSecurityId(nclient);
			secEntity.setTdcSecurityMask(" ");
			
			tdcSecurityRepository.insertTdcSecurity(secEntity);
			
			if(tdcSecurityRepository.pasaSecurity(nclient)){
				log.debug("Paso Security");
				HashMap<String, Object> res=new HashMap<>();
				return res;	
			}else{
				log.debug("No Paso security");
				HashMap<String, Object> res=new HashMap<>();
				return res;
			}	
		}
	}
	
	private HashMap<String,Object> getDatosSys16Cross(String nclient){
		 log.debug("getDatosSys16Cross(String:"+nclient+")");
		 
		 HashMap<String,Object>  datos = new HashMap<String,Object>();
		 HashMap<String,String> informacionContenido = new HashMap<String,String>();
		 ArrayList<String> ofertas = new  ArrayList<String>();
		 CrossellEntity crossellEntity=null;
		 String numCliente="";
		 
		 datos.put("Crossell",false);
		 datos.put("es16",false);
		 
		 /*
		  * Verificar si la peticion de datos del cliente se realiza
		  * por medio del número de cliente o por le folio.
		  */
		 if(nclient.length()<=13){
			 /*
			  * Verificación por número de cliente.
			  */
			 log.debug("Es numero de cliente:"+nclient);
			 numCliente=nclient;
			
			 try{
				 Long a = new Long(numCliente);
				 crossellEntity=crosselServ.getClienteByNumCte(a);
			 }catch(NumberFormatException e){ 
				 log.warn("Numero de cliente no es Long:"+nclient);  
				 datos.put("succes", false);
				 return datos;
			 }
		 }else{
			 /*
			  * Verifición por folio
			  */
			 log.debug("Es folio");
			 crossellEntity=crosselServ.getClienteByFolio(nclient);
			 if(crossellEntity==null){ 
				 numCliente="12345678";
			 }else{
				 numCliente=""+crossellEntity.getCrosselClteNumero();
			 }
		 }
			
		 datos.put("nclient", numCliente);
		 datos.put("fecha_nac", "");
		
		 Hashtable<String, Object> datosPre =  s016SystemService.geDataSistema16(numCliente) ;
		
		 log.debug("datosPre:"+datosPre);
		 InformacionClienteBean informacionCliente = new InformacionClienteBean();
		 informacionCliente.setInformacionPersonal(new HashMap<String, String> ());
		 informacionCliente.setInformacionCrediticia(new HashMap<String, String> ());
		 informacionCliente.setInformacionExtra(new HashMap<String, String> ());
		 informacionCliente.setInformacionLaboral(new HashMap<String, String> ());
		 informacionCliente.setInformacionPromotora(new HashMap<String, String> ());
			
		if(datosPre!=null && datosPre.size()>0){
			if(!( datosPre.get("STDS_CTE_NOMBRE")==null || datosPre.get("STDS_CTE_NOMBRE").toString().length()==0)){
				HashMap<String,String> infoPersonal = transformaInfo(datosPre);
				datos.put("fecha_nac", infoPersonal.get("fecha_nac"));
					
				informacionCliente.setInformacionPersonal(infoPersonal);
					
				informacionContenido.put("nombre_mascarilla", mascarilla(infoPersonal.get("nombre"))+" "+mascarilla(infoPersonal.get("paterno"))+" "+mascarilla(infoPersonal.get("materno")) );
				informacionContenido.put("direccionMascarilla",mascarilla(infoPersonal.get("calle")));
			 		
				datos.put("es16",true);
			}
		}else{
			datos.put("nclient", "");
		} 
			
		if(crossellEntity!=null){
			ofertas.add(""+crossellEntity.getCrossellClteProduct1());
			ofertas.add(""+crossellEntity.getCrossellClteProduct2());
			ofertas.add(""+crossellEntity.getCrossellClteProduct3());
			datos.put("Crossell",true);
		}
			
		datos.put("Infocontenido", informacionContenido);
		datos.putAll(UtilityRevision.Regresafaltantes(informacionCliente));
		datos.put("Productos_ofertados",ofertas);
		datos.put("succes", true);
			
		log.debug("DatosFaltantesARegresar: "+ GsonR.toJson(datos));
			
		return datos;
			 
		
	}
		
	private static HashMap<String,String> transformaInfo(Hashtable<String,Object> datosPre){
		HashMap<String,String>  res=new HashMap<String,String> ();
		
		try{	
			String rfcN = (String)datosPre.get("CTES_PER_VALINICRFC");
			String rfcF= (String)datosPre.get("CTEL_PER_FECRFC") ;
			String rfcH= (String)datosPre.get("CTES_PER_CVEHOMORFC") ;
											
			String rfc_completo="";
			
			if(rfcN.trim().length()==4 && rfcF.trim().length()==6){
				rfc_completo = rfcN.trim()+rfcF.trim();
				
				if(rfcH.trim().length()==3){
					rfc_completo = rfc_completo+rfcH.trim();
				}
				
				res.put("rfc_completo",rfc_completo );
			}
			
			res.put("colonia",(String) datosPre.get("CTES_DOM_NOMCOLONIA") );
			res.put("estado", (String) datosPre.get("CTEI_DOM_CVEESTADO"));
//			String[] extension=(String[])datosPre.get("CTEL_DOM_NUMEXTTEL"); // No es utilizado
			String[] lada=(String[])datosPre.get("CTEL_DOM_CODLADA");
			res.put("lada", lada[0]);
			res.put("nacionalidad", (String) datosPre.get("CTEI_PER_CVENACION"));
			
			//Modifique aqui
			//07/10/16 nombre estado --->estado_name
			HashMap<String, Object> estado;
			HashMap<String, Object> parametros = new HashMap<String, Object>();
			parametros.put("cp", (String)datosPre.get("CTEL_DOM_CODPOSTAL"));
			
			try{
				ModeloCatalogoService modeloCatalogoService = new  ModeloCatalogoServiceImpl();
				 
				estado = modeloCatalogoService.getEstadoDelegacionColonia20(parametros);		
				modeloCatalogoService =null;
				@SuppressWarnings("unchecked")
				HashMap<String, Object> datos = (HashMap<String, Object>) estado.get("datos");
				//Se agrego cambio para letra con acento en el estado
				String estadoA =String.valueOf(datos.get("Estados_name"));
				//	estadoA = estadoA.replace("MXICO", "MEXICO").replace("MICHOACN", "MICHOACAN").replace("LEN", "LEON").replace("QUERTARO", "QUERETARO").replace("YUCATN", "YUCATAN").replace("POTOSI", "POTOS").replace("POTOS", "POTOSI");
				res.put("estado_name",estadoA);			
				@SuppressWarnings("unchecked")
				HashMap<String, Object> delegaciones = (HashMap<String, Object>) datos.get("delegaciones");			
				res.put("municipio", (String) delegaciones.get("Del_nombre"));
			}catch(Exception e){
				log.error("Error al consultar catalogos del 80",e);
			}
			
			String[] mail=(String[])datosPre.get("CTES_DOM_VALDOMELECT");
			if(mail!=null){
				res.put("email",mail[0]);
			}
			res.put("fecha_nac", (String)datosPre.get("CTEL_PER_FECNACIM"));
			String fecha = (String)datosPre.get("CTEL_PER_FECNACIM");
			String year="";
			String month="";
			String day="";
			if(fecha!=null&&fecha.length()>1){
				year=fecha.substring(0, 4);
				 month=fecha.substring(4, 6);
				 day=fecha.substring(6);
			}
			 
			res.put("year",year);
			res.put("month",month);
			res.put("day",day);
			
			String codigo_postal = (String)datosPre.get("CTEL_DOM_CODPOSTAL");
			if(codigo_postal.length()==4){
				codigo_postal = "0" + codigo_postal;
			}
			
			res.put("codigo_postal", codigo_postal);
			res.put("calle", (String)datosPre.get("CTES_DOM_NOMCALLE"));
			res.put("num_cte", (String)datosPre.get("STDN_CTE_NUM"));
			
			String nombreAux =  (String)datosPre.get("STDS_CTE_NOMBRE");
			String[] nombreArray=nombreAux.split(",");
			String nombre=nombreArray[0];
			
			log.debug("nombreAux 16:"+nombreAux);
			if(nombreArray.length>1){
				
				String[] apellidoArray=nombreArray[1].split("\\/");
				String aPaterno=apellidoArray[0];
				String aMaterno=(apellidoArray[1]!=null) ? (apellidoArray[1]).trim() : "";
				
				log.debug("apellidoArray 16:"+GsonR.toJson(apellidoArray)+" :: aPaterno("+aPaterno+") aMaterno("+aMaterno+")");
				
				
				//nombreMascarilla+=" "+mascarilla(aPaterno);
				//nombreMascarilla+=" "+mascarilla(aMaterno);
				res.put("paterno", aPaterno);
				res.put("materno", aMaterno);
				
			}
			/*
			if(res.get("calle").length()>0){
				StringBuffer sb=new StringBuffer();
				sb.append(mascarilla(res.get("calle")));
				
			//	res.put("direccionMascarilla",sb.toString());
				log.info(sb.toString());
			}*/
			
			//regreso.put("nombre_mascarilla", nombreMascarilla);
		    res.put("nombre",nombre);
		    
		    String[] telefono=(String[])datosPre.get("CTEN_DOM_NUMTEL");
		    res.put("telefono", telefono[0]);
		    
		    
		    String sexo_ =( (String)datosPre.get("CTEI_PER_CVESEXO") ).trim();
		    if(sexo_.equals("1")){
		    	res.put("sexo","M" );
		    }else{
		    	res.put("sexo","F" );
		    }
		    
		    if( (res.get("lada").length()+res.get("telefono").length()) !=10 ){
		    	res.remove("lada");
		    	res.remove("telefono");
		    }
		    	
		  

		}catch(NullPointerException e){
			log.error("NullPointerException",e);
		}
		
		for (String key : res.keySet()) {
			String value_ = res.get(key);
			if(value_!=null){
				value_=value_.replaceAll("[^a-zA-Z0-9����\\s\\.@]","");
				//cambiar la @ por las �� 
				if(!key.equals("email")){
					
				    res.put(key, value_.trim().toUpperCase().replace("@", "��"));
					//07/10/16
						/* 
					res.put(key, value_.trim().toUpperCase().replace("#", ""));
					res.put(key, value_.trim().toUpperCase().replace(".", ""));*/
				}else{
					res.put(key, value_.trim());
				}

			}
		}
		
		log.debug("transformaInfo:"+GsonR.toJson(res));
		
		return res;
	}
	
	private static String mascarilla(String s){
		
		StringBuffer sb=new StringBuffer();
		if(s!=null&&s.length()>0){
		sb.append(s.charAt(0));
		boolean ponerLetra=false;
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)==' '){
				
				sb.append(' ');
				ponerLetra=true;
			}else{
				if(ponerLetra){
					sb.append(s.charAt(i));
					ponerLetra=false;
				}else{
					sb.append("*");	
				}
					
			}
			
		}
		return sb.toString();
		}else{
			return "";
		}
	}

}
