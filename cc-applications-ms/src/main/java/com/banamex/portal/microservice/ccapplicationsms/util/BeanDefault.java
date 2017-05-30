package com.banamex.portal.microservice.ccapplicationsms.util;

import java.util.HashMap;

import org.apache.log4j.Logger;

public class BeanDefault {
	
private static Logger log = Logger.getLogger(BeanDefault.class);
	
	public static HashMap<String,String> informacionPersonal = new HashMap<String,String>();
	public static HashMap<String,String> informacionLaboral = new HashMap<String,String>();
	public static HashMap<String,String> informacionCrediticia = new HashMap<String,String>();
	public static HashMap<String,String> informacionPromotora = new HashMap<String,String>();
	public static HashMap<String,String> informacionExtra = new HashMap<String,String>();
	
	public static void  inicializaDefault(){
		inicializarinformacionPersonal();
		inicializarinformacionLaboral();
		inicializarinformacionCrediticia();
		inicializarinformacionPromotora();
		inicializarinformacionExtra();		
	}
	
	private static void inicializarinformacionExtra(){
		log.info("Cargando informacionExtra");
		informacionExtra.put("contratotdc","0");
		informacionExtra.put("verificarCaptura","1");
		informacionExtra.put("nclient","");
		informacionExtra.put("es16","false");
	}
	 
	private static void inicializarinformacionPromotora(){
 
		log.info("Cargando informacionPromotora");
		informacionPromotora.put("ingresos","0");
		informacionPromotora.put("sucursalPromotora","8082");
		informacionPromotora.put("canalPromotora","16");
		informacionPromotora.put("empresaPromotora","25");
		informacionPromotora.put("pos","70001");
		/*
		 * Obtener informacion sobre estos campos, seran o no utilizados. 
		 */
//		informacionPromotora.put("estadoPromotora","25");// no se tiene  en el front revisar
//		informacionPromotora.put("autentica","");
//		informacionPromotora.put("ejecutivo","");
//		informacionPromotora.put("productoPromotora",""); // en CRE_SolRegP en el bean se pasa como 40 revisar
		
	}
	
	private static void inicializarinformacionCrediticia(){
		log.info("Cargando informacionCrediticia");
		informacionCrediticia.put("titular_tc_banco","0");//0,1
		informacionCrediticia.put("tarjeta_credito","0");//####
		informacionCrediticia.put("tarjeta_creditoFormat","");//####
		informacionCrediticia.put("institucion_credito","");//id catalogo bancos
		informacionCrediticia.put("titular_tarjeta_dep","0");//0,1
		informacionCrediticia.put("tarjeta_dep","");//####
		informacionCrediticia.put("tarjeta_depFormat","");//####
		informacionCrediticia.put("titular_cred_hip","0");//0,1
		informacionCrediticia.put("titular_cred_aut","0");//0,1
		informacionCrediticia.put("contrato","");//0,1
		
		/*
		 * Obtener informacion sobre estos campos, seran o no utilizados. 
		 */
		informacionCrediticia.put("institucion_dep","");//id catalogo instituciones departamentales --NOSEOCUPA
		informacionCrediticia.put("institucion_hip","");//id insttituciones creditos hipotecarios --NOSEOCUPA
		informacionCrediticia.put("institucion_aut","");//id catalogo instituciones --NOSEOCUPA
		informacionCrediticia.put("codigo","");// --NOSEOCUPA
//		informacionCrediticia.put("serialVersionUID","");
	}
	
	private static void inicializarinformacionLaboral(){
		log.info("Cargando informacionLaboral");
		
		informacionLaboral.put("nombre_empresa","");
		informacionLaboral.put("ocupacion","");
		informacionLaboral.put("anio_antiguedad","");
		informacionLaboral.put("calle_empresa","");
		informacionLaboral.put("codigo_postal_empresa","");
		informacionLaboral.put("colonia_empresa","");
		informacionLaboral.put("municipio_empresa","");
		informacionLaboral.put("estado_empresa","");
		informacionLaboral.put("lada_empresa","");
		informacionLaboral.put("telefono_empresa","");
		informacionLaboral.put("ext_tel_empresa","");
		informacionLaboral.put("telefonoEmpresaValido","");
		informacionLaboral.put("ingresos","");
		informacionLaboral.put("institucion_credito","0");//static in form
		informacionLaboral.put("num_tarjeta","0");//static inf form
		informacionLaboral.put("institucion_cheques","0");//static in form
		informacionLaboral.put("tipo_contrato","");
		informacionLaboral.put("num_cuenta","0");
		informacionLaboral.put("nombre_ref1","");
		informacionLaboral.put("paterno_ref1","");
		informacionLaboral.put("materno_ref1","");//static in form
		informacionLaboral.put("lada_ref1","");
		informacionLaboral.put("telefono_ref1","");
		informacionLaboral.put("ext_tel_ref1","");
		informacionLaboral.put("telefonoEmpresaValido_Ref1","");
		informacionLaboral.put("parentesco_ref1","9");//static in form
		informacionLaboral.put("paterno_ref2","");//static in form
		informacionLaboral.put("nombre_ref2","");//static in form
		informacionLaboral.put("materno_ref2","");//static in form
		informacionLaboral.put("lada_ref2","");//static in form
		informacionLaboral.put("telefono_ref2","");//static in form
		informacionLaboral.put("ext_tel_ref2","");//static in form
		informacionLaboral.put("telefonoEmpresaValido_Ref2","");
		informacionLaboral.put("parentesco_ref2","9");//static in form
		informacionLaboral.put("banamex_libra","");
		informacionLaboral.put("numero_empresa_ext","");
		informacionLaboral.put("numero_empresa_int","");
		informacionLaboral.put("fecha_nacR1","00000000");//static in form
		informacionLaboral.put("fecha_nacR2","00000000");//static in form
		informacionLaboral.put("proteccion_saldo","");
		informacionLaboral.put("proteccion_accidente","");
		informacionLaboral.put("estado_seguro","");
		informacionLaboral.put("otro_credito","0");
		informacionLaboral.put("asistencia_depor","");
		informacionLaboral.put("universidad","");
		informacionLaboral.put("carrera","");
		informacionLaboral.put("fecha_nacIC","00000000");
		informacionLaboral.put("fecha_nacFC","00000000");
		informacionLaboral.put("totalMaterias","");
		informacionLaboral.put("totalAprobadas","");
		informacionLaboral.put("semestre","");
		informacionLaboral.put("promedio","");
		informacionLaboral.put("tieneBeca","");
		informacionLaboral.put("tipoBeca","");
		informacionLaboral.put("nombreTA1","");//static in form
		informacionLaboral.put("nombreTA2","");//static in form
		informacionLaboral.put("paternoTA1","");//static in form
		informacionLaboral.put("paternoTA2","");//static in form
		informacionLaboral.put("maternoTA1","");//static in form
		informacionLaboral.put("maternoTA2","");//static in form
		informacionLaboral.put("parentescoTA1","0");//statico in form
		informacionLaboral.put("parentescoTA2","0");//static in form
		informacionLaboral.put("direccionCI_empresa","");
		
		/*
		 * Obtener informacion sobre estos campos, seran o no utilizados. 
		 */
		informacionLaboral.put("num_ext_empresa","");//--NOSEOCUPA
		informacionLaboral.put("num_int_empresa","");//--NOSEOCUPA
		informacionLaboral.put("actividad_empresa","");//--NOSEOCUPA
		informacionLaboral.put("puesto","PROPIETARIO");//static in form //--NOSEOCUPA
//		informacionLaboral.put("serialVersionUID","1");
	}
	
	private static void inicializarinformacionPersonal(){
		log.info("Cargando inicializarinformacionPersonal");
		
		informacionPersonal.put("comprobar_ingresos","1");//static in form //--NOSEOCUPA
		informacionPersonal.put("ingresos","0");//-->mod -->arreglo //--NOSEOCUPA
		informacionPersonal.put("tipo_tarjeta",""); //--NOSEOCUPA
		
		//se quito del formulario
		
		informacionPersonal.put("miembro_aadv","0");//El front ya no lo usa, aqui se pone como estatico para no enviar
		//informacionPersonal.put("num_aadv","");//sttaic in form   -->no esta en el formulario revisar
		
		//-- no esta en fomulario actual, 
		informacionPersonal.put("cliente_bmx","0");//sttaic in form
		
		informacionPersonal.put("num_cte","");//static in form
		
		informacionPersonal.put("nombre","");
		informacionPersonal.put("paterno","");
		informacionPersonal.put("materno","");
		
		//yyyymmdd
		informacionPersonal.put("fecha_nac","");
		//en caso que el cliente ponga el homoclave , longitud 13
		informacionPersonal.put("rfc_completo","");//10, 13 long
		
		informacionPersonal.put("rfc_homoclave","");//3 int
		
		//se copia el rfc
		informacionPersonal.put("curp","");
		
		//numerico
		informacionPersonal.put("grado_estudios","");
		
		//numerico , mexicana, -1 extranjero
		informacionPersonal.put("nacionalidad",""); //--NOSEOCUPA
		
		//numerico, mexico 1, en que pais soy 
		informacionPersonal.put("pais","");
		
		//M,F
		informacionPersonal.put("sexo","");
		//numerico
		informacionPersonal.put("edo_civil","");
		
		//numerico
		informacionPersonal.put("personas_dependen","");
		
		
		informacionPersonal.put("email","");
		informacionPersonal.put("email2","");
		
		
		informacionPersonal.put("permiso","0");//not found form
		
		
		informacionPersonal.put("fiel","");//static in form
		
		//numerico
		informacionPersonal.put("pais_nacimiento","");
		
		informacionPersonal.put("calle","");
		
		informacionPersonal.put("num_ext","");//not found in form
		informacionPersonal.put("num_int","");//not found in form
	
		informacionPersonal.put("codigo_postal","");
		informacionPersonal.put("colonia","");
		informacionPersonal.put("municipio","");
		
		//numerico
		informacionPersonal.put("estado","");
		
		//numerico
		informacionPersonal.put("tipo_vivienda","");
		//numerico,yymm
		informacionPersonal.put("anio_residencia","");
		
		//numerico,2,3 dig
		informacionPersonal.put("lada","");
		
		//numerico de 7 a 8 dependiente de la LADA
		informacionPersonal.put("telefono","");
		
		//numerico a 10
		informacionPersonal.put("celular_044","");
		
		//numerco lada mas telefono normal a 10 digititos
		informacionPersonal.put("telefonoValido","");
		//yyyy dig
		informacionPersonal.put("year","");
		//m
		informacionPersonal.put("month","");
		//1, 2
		informacionPersonal.put("day","");
		
		informacionPersonal.put("entrega","2");//static in form		
		informacionPersonal.put("miembro_aprecio","");//not found in form
		informacionPersonal.put("num_aprecio","");//not found in form
		informacionPersonal.put("miembro_cpremier","0");//not found in form
		informacionPersonal.put("num_cpremier","");//not found in form
		informacionPersonal.put("calle2_txt","");//not found in form
		informacionPersonal.put("numero_ext","");
		informacionPersonal.put("numero_int","");
		
		//--- ESC variables--
		informacionPersonal.put("org","");// in form
		informacionPersonal.put("logo","");// in form
		informacionPersonal.put("plastid","");// in form
		informacionPersonal.put("srccode","");// in form
		informacionPersonal.put("subproducto","");// in form
		//--------------
		
		informacionPersonal.put("rfccalc","");
		informacionPersonal.put("direccionCI","");
		informacionPersonal.put("serialVersionUID","1");//static not found in form
		informacionPersonal.put("entidadFederativa","");
		informacionPersonal.put("taxid","");
		
		///credito inmediato nada de cia
		
	}

}
