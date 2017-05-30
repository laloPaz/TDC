package com.banamex.portal.microservice.ccapplicationsms.callswitch.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.banamex.portal.microservice.ccapplicationsms.callswitch.S080SystemMs;
import com.banamex.portal.microservice.ccapplicationsms.util.ConstantesSTC;
import com.banamex.portal.microservice.ccapplicationsms.util.GsonR;
import com.banamex.portal.microservice.ccapplicationsms.util.Label;
import com.banamex.portal.microservice.ccapplicationsms.util.Messages;

public class S080SystemMsImpl implements S080SystemMs{
	
	private static Logger log = Logger.getLogger(S080SystemMsImpl.class);

	
	/*
	 * Todos los llamados al microServicio S080 informacion de catalogos
	 */
	@Override
	public HashMap<String, String> getPaises() {
		HashMap <String,String> paises = new HashMap<String,String>();
		String sql_ = "SELECT NACIONA, D_LARGA  FROM D000597";
		//DESCOMENTAR
		/*
		 * 
		 
		Registros80 paises_ = ExecuteServiceCatalogo.executeQuery(sql_);
		
		if(paises_.datos.size()>0){
			for(int i=0; i<paises_.datos.size(); i++){
				List DataColonia = (List)paises_.datos.get(i);
				//log.info( paises_.campos.get("NACIONA"));
				paises.put((String) DataColonia.get(paises_.campos.get("D_LARGA")), (String) DataColonia.get(paises_.campos.get("NACIONA")));          
	        }
		}*/
		return paises;

	}
	
	@Override
	public HashMap<String, Object> getEstadoDelegacionColoniaCatalog(HashMap<String, Object> parametros) {
		
		Properties mensaje= Messages.es;
		HashMap<String, Object> rest = new HashMap<String, Object>();
		String sql;
		String cp;
		
		rest.put(Label.L_success,false); 	
		
		sql = (String) ((parametros.get("sql")!=null) ? parametros.get("sql") : "");
		cp = (String) ((parametros.get("cp")!=null) ? parametros.get("cp") : "");
		
		if(!sql.equals("")){
			try {		  
					/*
					 * Descomentar cuando se implemente el llamado del microservicio
					 */
					//rest.put(Label.L_datos,ExecuteServiceCatalogo.executeQuery(sql));
			    	rest.put(Label.L_success,true);
			} catch (Exception e) {
				log.error("Exception ExecuteServiceCatalogo.executeQuery ", e);
				rest.put(Label.L_success,false);
				rest.put(Label.L_codigo_error,ConstantesSTC.ERROR_AL_OBTENER_LOS_DATOS_EN_BASE);
			} 
		}else{
			if(!cp.equals("")){
				HashMap<String, Object> datos = new HashMap<String, Object>();
				HashMap<String, Object> delegaciones = new HashMap<String, Object>();			
				List colonias = new ArrayList();
				
				sql ="SELECT ESTADO, CIUDAD, CLASE, MUNICIP, CODIGO, DESCRIP FROM L000004 WHERE CODIGO = "+cp+" ORDER BY DESCRIP"; 
				log.info("sql:"+sql);
				
				/*
				 * Descomentar cuando se implemente el llamado del microservicio
				 */
				boolean bandera = false;
				
				/*Registros80 coloniasObj = ExecuteServiceCatalogo.executeQuery(sql_);
				
				log.info("coloniasObj.datos.size():"+coloniasObj.datos.size());
				
				if(coloniasObj.datos.size()>0){
					 
					List datos  = (List)coloniasObj.datos.get(0);
					
					log.info("(List)coloniasObj.datos.get(0):"+datos.size());
					
					String ESTADO = (String) datos.get( coloniasObj.campos.get("ESTADO")  );
					String CIUDAD = (String) datos.get( coloniasObj.campos.get("CIUDAD")  );
					String MUNICIP = (String) datos.get( coloniasObj.campos.get("MUNICIP")  );
					 
					log.info("ESTADO:"+ESTADO);
					log.info("CIUDAD:"+CIUDAD);
					log.info("MUNICIP:"+MUNICIP);
					log.info("coloniasObj.datos.size():"+coloniasObj.datos.size());
					 
					//colonia 
					for(int i=0; i<coloniasObj.datos.size(); i++){
						List DataColonia = (List)coloniasObj.datos.get(i ); 
						colonias.add(  DataColonia.get(coloniasObj.campos.get("DESCRIP")) )  ;
			        }
					
					
					sql = "SELECT		DESCRIP FROM L000004 WHERE  ESTADO = "+ESTADO+"  AND CIUDAD ="+CIUDAD+"  AND MUNICIP = "+MUNICIP+" AND CODIGO = 0";
					log.info("sql:"+sql);
					
					//delegacion o municipio
					Registros80 delegacionObj = ExecuteServiceCatalogo.executeQuery(sql_);
					List datosColonia  = (List)delegacionObj.datos.get(0);
					if(datosColonia.size()>0){
						log.info("datosColonia count :"+datosColonia.size());
						//ESTADO
						sql = "SELECT DESCRIP FROM L000004 WHERE  ESTADO = "+ESTADO+"  AND CIUDAD =0  AND MUNICIP =0 AND CODIGO =0 ";
						log.info("sql:"+sql_);
						Registros80 estadoObj = ExecuteServiceCatalogo.executeQuery(sql_);
						List datosEstados  = (List)estadoObj.datos.get(0);
						if(datosEstados.size()>0){
							log.info("datosEstados count :"+datosEstados.size());
							
							delegaciones.put("Del_nombre", datosColonia.get( delegacionObj.campos.get("DESCRIP")      ));
							delegaciones.put("colonias", colonias);
							
							datos_.put("Estados_name", datosEstados.get(   estadoObj.campos.get("DESCRIP") ));
							datos_.put("Estados_id", ESTADO );
							datos_.put("delegaciones", delegaciones );
							bandera = true;
						}
					}
					
				}	
				*/
				
				if(bandera = false){
					datos = new HashMap<String, Object>();
				}
				
				rest.put("datos", datos);
				rest.put("success", true);
				
			}else{
				rest.put(Label.L_success, false);
				rest.put(Label.L_codigo_error,ConstantesSTC.ERROR_VALIDACION_INCORRECTA_DE_DATOS);
				rest.put("sql", mensaje.getProperty("message.validDato.required"));
			}
		}
		return rest;
	}
	
	@FeignClient(name = "ccS080eMs")
	public interface DatabaseMicroServiceClient {
		
		@RequestMapping(value = "/getResultService", method = RequestMethod.POST, produces = "application/json")
		public  HashMap<String, Object> getResultQuery(@RequestBody HashMap<String, Object> datos);
		
	}



	
	

}
