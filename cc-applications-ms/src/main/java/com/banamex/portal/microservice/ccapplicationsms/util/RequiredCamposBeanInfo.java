package com.banamex.portal.microservice.ccapplicationsms.util;

import java.util.HashMap;

import org.apache.log4j.Logger;

public class RequiredCamposBeanInfo {

private static Logger log = Logger.getLogger(RequiredCamposBeanInfo.class);
	
	public static HashMap<String,String> requiredInformacionPersonal = new HashMap<String,String>();
	public static HashMap<String,String> requiredInformacionLaboral = new HashMap<String,String>();
	public static HashMap<String,String> requiredInformacionCrediticia = new HashMap<String,String>();
	public static HashMap<String,String> requiredInformacionExtra = new HashMap<String,String>();
	public static HashMap<String,String> requiredInformacionPromotora = new HashMap<String,String>();
	
	
	public static void  inicializaRequired(){
		log.info("inicia   requiredCamposBeanInfo");
		inicializarrequiredInformacionPersonal();
		inicializarrequiredInformacionLaboral();
		inicializarInformacionCrediticia();
		inicializarInformacionExtra();
		inicializarInformacionPromotora();
		log.info("requiredCamposBeanInfo ok");
	}
	
	private static void inicializarInformacionExtra(){
		requiredInformacionExtra.put("contratotdc","true");
		requiredInformacionExtra.put("verificarCaptura","true");
		requiredInformacionExtra.put("nclient","false");
		requiredInformacionExtra.put("es16","false");
	}
	
	private static void inicializarInformacionPromotora(){
		requiredInformacionPromotora.put("sucursalPromotora","true");
		requiredInformacionPromotora.put("canalPromotora","true");
		requiredInformacionPromotora.put("empresaPromotora","true");
		requiredInformacionPromotora.put("pos","true");
	}
	
	private static void inicializarInformacionCrediticia(){
		requiredInformacionCrediticia.put("titular_tc_banco","true");
		requiredInformacionCrediticia.put("tarjeta_credito","true");
		requiredInformacionCrediticia.put("institucion_dep","true");
		requiredInformacionCrediticia.put("tarjeta_dep","true");
		requiredInformacionCrediticia.put("titular_cred_hip","true");
		requiredInformacionCrediticia.put("titular_cred_aut","true");		
		/*
		 * En mascarilla
		 * si titular_tc_banco =0  &&  titular_cred_hip=0 && titular_cred_aut=0
		 * decirle que acuda a sucursal
		 * 
		 */
	}
	
	private static void inicializarrequiredInformacionLaboral(){
		requiredInformacionLaboral.put("nombre_empresa","true");
		requiredInformacionLaboral.put("actividad_empresa","true");
		requiredInformacionLaboral.put("aniores","true");
		requiredInformacionLaboral.put("mesres","true");
		requiredInformacionLaboral.put("ocupacion","true");
		requiredInformacionLaboral.put("calle_empresa","true");
		requiredInformacionLaboral.put("numero_empresa_ext","true");
		requiredInformacionLaboral.put("codigo_postal_empresa","true");
		requiredInformacionLaboral.put("estado_empresa","true");
		requiredInformacionLaboral.put("estado_name","true");
		requiredInformacionLaboral.put("municipio_empresa","true");
		requiredInformacionLaboral.put("colonia_empresa","true");
		requiredInformacionLaboral.put("ingresos","true");
		requiredInformacionLaboral.put("nombre_ref1","true");
		requiredInformacionLaboral.put("paterno_ref1","true");
		requiredInformacionLaboral.put("lada_empresa","true");
		requiredInformacionLaboral.put("telefono_empresa","true");
		requiredInformacionLaboral.put("telefono_ref1","true");
		/*
		 * Obtener informacion sobre estos campos, seran o no utiizados. 
		 */
//		requiredInformacionLaboral.put("anio_antiguedad","true");
//		requiredInformacionLaboral.put("numero_empresa_int","true");
//		requiredInformacionLaboral.put("direccionCI_empresa","true");
//		requiredInformacionLaboral.put("ext_tel_empresa","true");
//		requiredInformacionLaboral.put("ext_tel_ref1","true");

	}
	
	private static void inicializarrequiredInformacionPersonal(){
		
		requiredInformacionPersonal.put("ingresos","true");
		requiredInformacionPersonal.put("tipo_tarjeta","true");
		requiredInformacionPersonal.put("subproducto","true");
		requiredInformacionPersonal.put("paterno","true");
		requiredInformacionPersonal.put("nombre","true");
		requiredInformacionPersonal.put("year","true");
		requiredInformacionPersonal.put("month","true");
		requiredInformacionPersonal.put("day","true");
		requiredInformacionPersonal.put("rfc_completo","true");
		requiredInformacionPersonal.put("sexo","true");
		requiredInformacionPersonal.put("nacionalidad","true");
		requiredInformacionPersonal.put("pais","true");
		requiredInformacionPersonal.put("pais_nacimiento","true");
		requiredInformacionPersonal.put("grado_estudios","true");
		requiredInformacionPersonal.put("edo_civil","true");
		requiredInformacionPersonal.put("personas_dependen","true");
		requiredInformacionPersonal.put("email","true");
		requiredInformacionPersonal.put("calle","true");
		requiredInformacionPersonal.put("codigo_postal","true");
		requiredInformacionPersonal.put("estado","true");
		requiredInformacionPersonal.put("municipio","true");
		requiredInformacionPersonal.put("colonia","true");
		requiredInformacionPersonal.put("tipo_vivienda","true");
		requiredInformacionPersonal.put("aniores","true");
		requiredInformacionPersonal.put("mesres","true");
		requiredInformacionPersonal.put("lada","true");
		requiredInformacionPersonal.put("telefono","true");
		requiredInformacionPersonal.put("celular_044","true");
		requiredInformacionPersonal.put("org","true");
		requiredInformacionPersonal.put("logo","true");
		requiredInformacionPersonal.put("plastid","true");
		requiredInformacionPersonal.put("srccode","true");
		requiredInformacionPersonal.put("estado_name","true");
	
		/*
		 * Obtener informacion sobre estos campos, seran o no utilizados. 
		 */
//		requiredInformacionPersonal.put("direccionCI","true");
//		requiredInformacionPersonal.put("cliente_bmx","false");
//		requiredInformacionPersonal.put("telefonoValido","true");
//		requiredInformacionPersonal.put("anio_residencia","true");
//		requiredInformacionPersonal.put("numero_ext","true");
//		requiredInformacionPersonal.put("numero_int","true");
//		requiredInformacionPersonal.put("email2","true");
//		requiredInformacionPersonal.put("fiel","true"); //Siempre se envia vacio
//		requiredInformacionPersonal.put("entidadFederativa","true");//cambio, solo si es mexicano ->lo pidio vic 18/08/2016
//		requiredInformacionPersonal.put("rfccalc","true");
//		requiredInformacionPersonal.put("fecha_nac","true");
//		requiredInformacionPersonal.put("materno","true");
//		requiredInformacionPersonal.put("entrega","true");
//		requiredInformacionPersonal.put("num_cte","");
//		requiredInformacionPersonal.put("curp","true");
	}
	
}
