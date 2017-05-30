package com.banamex.portal.microservice.ccapplicationsms.callswitch.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.banamex.portal.microservice.ccapplications.domain.CrossellEntity;
import com.banamex.portal.microservice.ccapplications.domain.TdcSecurityEntity;
import com.banamex.portal.microservice.ccapplicationsms.callswitch.DataBaseSystemMs;

public class DataBaseSystemMsImpl implements DataBaseSystemMs{

	private static Logger log = Logger.getLogger(DataBaseSystemMsImpl.class);
	
	/*
	 * Llamados al microservicio de Base de datos, ejecutar cualquier
	 * consulta o modificacion de la base local
	 */
	
	/*
	 * TDC CrossellEntity
	 */
	@Override
	public CrossellEntity obtenerCLienteByNumCte(Long numCte){
		log.debug("obtenerCLienteByNumCte db");
		CrossellEntity c =null;
		
//		String sql= "Select * FROM TDC_CROSSELL_CLTE where CROSSELL_CLTE_NUMERO =? ";

		/*
		 * Relaizar la llamada a base de datos
		 */

		/*try{
			  List<CrossellEntity> cs = this.jdbcTemplate.query(sql, new Object[]{numCte}, new CrossellEntityWrapper());
			  if(cs.size()>=1){c = cs.get(0);}
		  }catch(EmptyResultDataAccessException e){
			  //log.error("exception ");
		}*/
		  
		  
		  return c;
	}
	
	@Override
	public CrossellEntity obtenerCrosselByFolio(String folio) {
		log.debug("obtenerCrosselByFolio db");
		CrossellEntity c =null;

		/*
		 * Relaizar la llamada a base de datos
		 */

//		  try{
//			  List<CrossellEntity> cs = this.jdbcTemplate.query("Select * FROM TDC_CROSSELL_CLTE where CROSSELL_CLTE_FOLIO =? ", new Object[]{folio}, new CrossellEntityWrapper());
//			  if(cs.size()>=1){c = cs.get(0);}
//		  }catch(EmptyResultDataAccessException e){
//				//log.error("exception ",e);
//		}
		  
		return c;
	}
	
	
	/*
	 * TDC DIRECCION 
	 */
	public HashMap<String, Object> getEstadoDelegacionColonia(String CP) {
		HashMap<String,Object> estado = new HashMap<String,Object>();
		
		HashMap<String,Object> delegaciones = new HashMap<String,Object>();
		
		List<String> colonias= new ArrayList(); 
		
		String selectSQL = "select tdc_estados.Estados_id, tdc_estados.Estados_name,tdc_delegaciones.Del_id, tdc_delegaciones.Del_name,tdc_codigo_postal.Col_name, tdc_codigo_postal.CP "+
				"from tdc_estados  , tdc_delegaciones  , tdc_codigo_postal  "+
				"where tdc_estados.Estados_id = tdc_delegaciones.Est_id AND tdc_delegaciones.Del_id = tdc_codigo_postal.Del_id AND  tdc_codigo_postal.CP = ? " +
				"order by tdc_estados.Estados_name, tdc_delegaciones.Del_name,tdc_codigo_postal.Col_name ";
		
		
		List<Map<String, Object>> rs = null;//jdbcTemplate.queryForList(selectSQL, CP);
		
		for(int i = 0 ; i<rs.size() ; i++){
			if(estado.size()==0){
				estado.put("Estados_id", ""+rs.get(i).get("Estados_id"));
				estado.put("Estados_name",""+rs.get(i).get("Estados_name"));
				estado.put("delegaciones", delegaciones);
			}	
			
			if(i==0){
				delegaciones.put("id",""+rs.get(i).get("Del_id"));
			    delegaciones.put("Del_nombre",""+rs.get(i).get("Del_name"));
				delegaciones.put("colonias",colonias);
				 
			}
			
			 	colonias.add((String)rs.get(i).get("Col_name"));

			
		}
		
		return estado;
	}
	
	
	/*
	 * TDC SECURITY
	 */
	
	@Override
	public boolean insertTdcSecurity(TdcSecurityEntity ent) {
		
		int pk=contTdcSecurity()+1;
		int intento=getIntento(ent.getTdcSecurityId());
		
		if(intento==0){
			String sql="insert into TDC_SECURITY  (TDC_SECURITY_PK,TDC_SECURITY_ID,TDC_SECURITY_INTENTO,TDC_SECURITY_MASK) VALUES (?,?,?,?)";
			/*
			 * Llamar el servicio de base de datos
			 */
			/*
			jdbcTemplate.update(sql,new Object[]{
			pk,ent.getTdcSecurityId(),1	,ent.getTdcSecurityMask()
			});
			*/	
		}else{
			String sql="UPDATE TDC_SECURITY SET TDC_SECURITY_INTENTO=? WHERE TDC_SECURITY_ID=?";
			/*
			 * Llamar el servicio de base de datos
			 */
			/*
			jdbcTemplate.update(sql,new Object[]{(intento+1),ent.getTdcSecurityId()
			});
			*/
		}
				
		return true;
	}
	
	@Override
	public boolean pasaSecurity(String idUsuario) {
		/*
		 * TRUE  : PASA SEGURIDAD
		 * FLASE : NO PASA SEGURIDAD
		 */
		String sql="select TDC_SECURITY_INTENTO from TDC_SECURITY where TDC_SECURITY_ID=?";				
		/*
		 * Llamar el servicio de base de datos
		 */
		/*
		try{
			int intentos= jdbcTemplate.queryForObject(sql,new Object[]{idUsuario}, Integer.class);
			if(intentos>5){
				return false;
			}else{
				return true;
			}
		}
		catch(EmptyResultDataAccessException e){
			return true;
		}*/
		return false;//eliminar esta linea al implementar el codigo de base
	}

	@Override
	public String getMask(String idUsuario) {
		
		String selectSQL="select TDC_SECURITY_MASK from TDC_SECURITY where TDC_SECURITY_ID=?";
		/*
		List<Map<String, Object>> rs = jdbcTemplate.queryForList(selectSQL,idUsuario);
		
		if(rs==null || rs.size()==0){
			return "";
		}
		
		return (String) rs.get(0).get("TDC_SECURITY_MASK"); 
		*/
		/*
		 * Llamar el servicio de base de datos
		 */
		return "";//Eliminar esta linea cuando el servicio este implementado
	    
	}

	@Override
	public boolean eliminaRegistro() {
		String sql="DELETE FROM TDC_SECURITY";
		/*
		 * Llamar el servicio de base de datos
		 */
		/*
		jdbcTemplate.execute(sql);
		*/
		return true;
	}
	
	private int contTdcSecurity(){
		String sql="select count(*) AS CONTADOR from TDC_SECURITY";
		/*
		 * Llamar el servicio de base de datos
		 */
		//int count= jdbcTemplate.queryForObject(sql,new Object[]{}, Integer.class);
		int count =0;
		return count;
	}

	private int getIntento(String ncliente){
		String sql="select TDC_SECURITY_INTENTO from TDC_SECURITY where TDC_SECURITY_ID=?";
		int count=0;
		
		/*
		 * Llamar el servicio de base de datos
		 */

		/*
		 try{
			 count= jdbcTemplate.queryForObject(sql,new Object[]{ncliente}, Integer.class);	
		}catch(EmptyResultDataAccessException e){
			 count=0;
		}
		*/
		
		return count;
	}
	
	
	@FeignClient(name = "ccDataBaseMs")
	public interface DatabaseMicroServiceClient {
		
		@RequestMapping(value = "/getResultBD", method = RequestMethod.POST, produces = "application/json")
		public  HashMap<String, Object> getResultQuery(@RequestBody HashMap<String, Object> datos);
		
	}
	
}
