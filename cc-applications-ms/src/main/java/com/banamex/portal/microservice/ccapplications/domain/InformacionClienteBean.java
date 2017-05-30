package com.banamex.portal.microservice.ccapplications.domain;

import java.util.HashMap;

import org.apache.log4j.Logger;

import com.banamex.portal.microservice.ccapplicationsms.util.BeanDefault;
import com.banamex.portal.microservice.ccapplicationsms.util.ConstantesSTC;
import com.banamex.portal.microservice.ccapplicationsms.util.UtilityRevision;

public class InformacionClienteBean {
	
private static Logger log = Logger.getLogger(InformacionClienteBean.class);
	
	private String  folio;
	private HashMap<String, String> informacionPersonal;
	private HashMap<String, String> informacionLaboral;
	private HashMap<String, String> informacionCrediticia;
	private HashMap<String, String> informacionExtra;
	private HashMap<String, String> informacionPromotora;
 
	/*
	 * Constructor vacio
	 */
	public InformacionClienteBean() {
		log.info("Obteniendo información de Cliente");
	}
	
	@SuppressWarnings("unchecked")
	public InformacionClienteBean(HashMap<String, Object> parametros) {
		this.setInformacionPersonal((HashMap<String, String>) parametros.get(ConstantesSTC.infoPersonal));
		this.setInformacionLaboral((HashMap<String, String>) parametros.get(ConstantesSTC.infoLaboral));
		this.setInformacionCrediticia((HashMap<String, String>) parametros.get(ConstantesSTC.infoCrediticia));
		this.setInformacionPromotora((HashMap<String, String>) parametros.get(ConstantesSTC.infoPromotora));//infoCrediticia  06-01-17
		this.setInformacionExtra((HashMap<String, String>) parametros.get(ConstantesSTC.infoExtra));
	}
	 
	public void mergeBeanDefault(){
		 
		HashMap<String, String> infoPersonal = new 	HashMap<String, String>();
		HashMap<String, String> infoLaboral= new 	HashMap<String, String>();
		HashMap<String, String> infoCrediticia= new 	HashMap<String, String>();
		HashMap<String, String> infoPromotora= new 	HashMap<String, String>();
		
		//datos necesarios, algunos son estaticos 
		infoPersonal.putAll(BeanDefault.informacionPersonal);
		infoLaboral.putAll(BeanDefault.informacionLaboral);
		infoCrediticia.putAll(BeanDefault.informacionCrediticia);
		infoPromotora.putAll(BeanDefault.informacionPromotora);
	 	
		//remplazar datos de los usuarios 
		infoPersonal.putAll(informacionPersonal);
		infoLaboral.putAll(informacionLaboral);
		infoCrediticia.putAll(informacionCrediticia);
		infoPromotora.putAll(informacionPromotora);
		
		if(infoPersonal.get("rfc_completo").length()==10){
			infoPersonal.put("rfc_completo",infoPersonal.get("rfc_completo")+ infoPersonal.get("rfc_homoclave"));
		}
		
		this.setInformacionPersonal(infoPersonal);
		this.setInformacionLaboral(infoLaboral);
		this.setInformacionCrediticia(infoCrediticia);
		this.setInformacionPromotora(infoPromotora);
		
		createVarExist();
	}
 
	private void createVarExist(){
		// -- poner valores que se obtienen de otro campos
		informacionPersonal.put("fecha_nac", informacionPersonal.get("year") + informacionPersonal.get("month") + informacionPersonal.get("day") );
		informacionPersonal.put("telefonoValido",informacionPersonal.get("lada")+informacionPersonal.get("telefono"));
		informacionPersonal.put("direccionCI",informacionPersonal.get("estado_name")+"*"+informacionPersonal.get("municipio")+"*"+informacionPersonal.get("colonia"));
		informacionPersonal.put("curp",informacionPersonal.get("rfccalc"));
		informacionPersonal.put("email2",informacionPersonal.get("email"));
		informacionPersonal.put("anio_residencia",informacionPersonal.get("aniores")+informacionPersonal.get("mesres"));
		//String direccioncompleta=informacionPersonal.get("calle")+"*"+informacionPersonal.get("numero_ext")+"*"+informacionPersonal.get("numero_int");
		
		//Se agrego cambio, en caso de que numero_int este vacio, no imprima el " ".
		String direccioncompleta;		
		if(informacionPersonal.get("numero_int").replace(" ","").equals("")){
			direccioncompleta=informacionPersonal.get("calle")+" "+informacionPersonal.get("numero_ext");
		}else{
			direccioncompleta=informacionPersonal.get("calle")+" "+informacionPersonal.get("numero_ext")+" "+informacionPersonal.get("numero_int");
		}
		
		informacionPersonal.put("direccioncompleta",direccioncompleta);
		
		informacionLaboral.put("nombre_ref2",informacionLaboral.get("nombre_ref1"));
		informacionLaboral.put("paterno_ref2",informacionLaboral.get("paterno_ref1"));
		informacionLaboral.put("lada_ref2",informacionLaboral.get("lada_ref1"));
		informacionLaboral.put("telefono_ref2",informacionLaboral.get("telefono_ref1"));
		informacionLaboral.put("anio_antiguedad",informacionLaboral.get("aniores")+informacionLaboral.get("mesres"));
		
		informacionLaboral.put("telefonoEmpresaValido", informacionLaboral.get("lada_empresa")+informacionLaboral.get("telefono_empresa"));
		informacionLaboral.put("telefonoEmpresaValido_Ref1", informacionLaboral.get("lada_ref1")+informacionLaboral.get("telefono_ref1"));
		informacionLaboral.put("direccionCI_empresa", informacionLaboral.get("estado_name")+"*"+informacionLaboral.get("municipio_empresa")+"*"+informacionLaboral.get("colonia_empresa"));
		
		informacionLaboral.put("telefonoEmpresaValido_Ref2",informacionLaboral.get("telefonoEmpresaValido_Ref1"));
		informacionLaboral.put("ext_tel_ref2",informacionLaboral.get("ext_tel_ref1"));
		//informacionLaboral.put("direccioncompleta",informacionPersonal.get("calle") + informacionPersonal.get("numero_ext") + informacionPersonal.get("numero_int"));
		
		informacionCrediticia.put("tarjeta_depFormat", UtilityRevision.getTarjeta_Format(informacionCrediticia.get("tarjeta_dep")));
		informacionCrediticia.put("tarjeta_creditoFormat", UtilityRevision.getTarjeta_Format(informacionCrediticia.get("tarjeta_credito")));
	}
 
	
	public HashMap<String, String> getInformacionExtra() {return informacionExtra;}
	public void setInformacionExtra(HashMap<String, String> informacionExtra) {this.informacionExtra = informacionExtra;}

	public HashMap<String, String> getInformacionPersonal(){return this.informacionPersonal;}
	public void setInformacionPersonal(HashMap<String, String> informacionPersonal){this.informacionPersonal = informacionPersonal;}
	
	public HashMap<String, String> getInformacionLaboral(){return this.informacionLaboral;}
	public void setInformacionLaboral(HashMap<String, String> informacionLaboral){ this.informacionLaboral=informacionLaboral;}
	
	public HashMap<String, String> getInformacionCrediticia(){return this.informacionCrediticia;}
	public void setInformacionCrediticia(HashMap<String, String> informacionCrediticia){ this.informacionCrediticia=informacionCrediticia;}
	
	public HashMap<String, String> getInformacionPromotora(){return this.informacionPromotora;}
	public void setInformacionPromotora(HashMap<String, String> informacionPromotora){this.informacionPromotora=informacionPromotora;}
	
	public String getFolio() {return folio;}
	public void setFolio(String folio) {this.folio = folio;}
}
