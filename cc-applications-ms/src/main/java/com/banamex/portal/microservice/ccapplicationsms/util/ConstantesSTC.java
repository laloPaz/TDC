package com.banamex.portal.microservice.ccapplicationsms.util;

import java.util.ArrayList;
import java.util.Arrays;

public class ConstantesSTC {


	//----- TIMEOUUT--------------
	public static final int TIMEOUT_CI_WSDL = 30000;
	//public static final int intentos_CRE_AutCte =2;
	
	public static final String BEL_CN_DGCTESS="BEL_CnDGCteSS";
	
	public static final String CRE_AutCte = "CRE_AutCte";
	public static final String CRE_AbanReg = "CRE_AbanReg";
	public static final String CRE_SolRegP = "CRE_SolRegP";
	public static final String CRE_IDCteConP = "CRE_IDCteConP";
	
	public static final String infoPersonal = "informacionPersonal";
	public static final String infoLaboral = "informacionLaboral";
	public static final String infoCrediticia = "informacionCrediticia";
	public static final String infoExtra = "informacionExtra";
											
	public static final String infoPromotora = "informacionPromotora";
	/*
	public static final String errorInfoPersonal = "errorInformacionPersonal";
	public static final String errorInfoLaboral = "errorInformacionLaboral";
	public static final String errorInfoCrediticia = "errorInformacionCrediticia";
	public static final String errorInfoExtra = "errorInformacionExtra";
	public static final String errorInfoPromotora = "errorInformacionPromotora";
	*/
	
	
	
	
   public static final String DEFAULT_POS_VALUE = "70001";
   
   
   public static final String ENTIDAD_TIPO = "12";
   public static final String ENTIDAD_NUMERO = "0";
   public static final String ENTIDAD_GRUPO = "12";
   public static final String ENTIDAD_OPERADOR = "03660931";
   public static final String ENTIDAD_SESSION = "38208";
   
 
   
   public static final String CORRESPONDENCIA_EMAIL = "1";

   public static final String BANCO_BANAMEX = "1";

   public static final Double INGRESOS_COMPROBADOS = Double.valueOf(0.0D);
   
   public static final Short ID_LEYENDA_PREAPROVADA = Short.valueOf((short)15);
  
   //-- status de la tarjeta ----
   

 	//--------  respuesta para el proceso  -----------------
 	//public static final int PREAPROBADA = 1;
 	//public static final int DECLINADA = 2;
 	//public static final int DUPLICIDAD_FOLIO = 3;
 	//public static final int DUPLICIDAD_PRODUCTO = 4;
 	//public static final int STATUS_PENDIENTE = 5;
 	//public static final int FUERA_HORARIO_SERVICIO = 6;
 	//public static final int PAGINA_NO_DISPONIBLE = 7;
 	//public static final int ENTRY_LEVEL = 8;
 	//public static final int ERROR_GENERAL = 9;
 	//public static final int CAPTURA = 10;
 	//public static final int NO_SOLICITUDES = 0;
 	//public static final int OTRO_PRODUCTO = 1;
 	//public static final int MISMO_PRODUCTO_NORMAL_PROCESO = 2;
 	//public static final int MISMO_PRODUCTO_CAPTURA = 3;
 	//public static final int MISMO_PRODUCTO_PROCESO = 4;
 	//public static final int MISMO_PRODUCTO_DIFERENTE_CLIENTE = 5;
 	//public static final int EXISTEN_SOLICITUDES_PREAPROBADAS = 7;
 	//public static final int EXITO_ORIGINACION = 20;
 	//public static final int PRODUCTO_ENTRY_LEVEL = 81;
 	//public static final int CLIENTE_AUTENTICADO = 82;
 	//public static final int CLIENTE_AUTENTICADO_SA = 83;
 	//public static final int CLIENTE_NO_AUTENTICADO = 84;
 	//public static final int ERROR_DATOS_ENTRADA = 10000;
 	//public static final int DATOS_INSUFICIENTES = 10001;
 	//public static final int ERROR_PAQUETE_PRODUCTO = 10002;
 	//public static final int OBTENCION_FONETICA = 10004;
 	//public static final int ERROR_AREA_RESPUESTA = 10005;
 	//public static final int ERROR_COSTRUCCION_RESPUESTA = 10006;
 	//public static final int ERROR_SISTEMA_ORIGINACION = 10007;
 	//public static final int ERROR_REGISTRO_SOLICITD = 10009;
 	//public static final int SOLICITUD_EXISTENTE = 11;
 	//public static final int SOLICITUD_DIFERENTE_FOLIO = 12;
 	//public static final int ERROR_OBTENER_DATOS_SOLICITANTE = 10018;
 	
 	
 //status en el proceso de realizar tdc
	 public static final int STATUS_TDC_NUEVO = 11;
	 public static final int STATUS_TDC_MODIFICADO =12;
	public static final int STATUS_TDC_PROCESADO =13;
	//------------ 
	
	//status de respuestra para consultar al ApplicationID 
	public static final int STATUS_TDC_PREAPROBADA =1;
	public static final int STATUS_TDC_DECLINADA =2;
	public static final int STATUS_TDC_PENDIENTE =5;
	
   
 	//----------------------------------------------------------
 	 public static final int BURO_AUTENTICADO = 85;
 	 public static final int BURO_NO_AUTENTICADO = 84;
 	//---------------------------------------------------------
 	 
 	 
 	public static final int   OK_AL_GUARDAR_DATOS_EN_BASE = 30001;
 	public static final int   OK_AL_MODIFICAR_DATOS_EN_BASE = 30002;
 	public static final int   OK_AL_TRAER_DATOS_DE_BASE = 30003;
 	 //-----------------------------------------------------------
 	 
 	 public static final int  ERROR_SERVICIO_NO_DISPONIBLE = 10046;
 	 public static final int  ERROR_FOLIO_NO_ENCONTRADO_EN_BASE = 20001;
 	 public static final int  ERROR_VERIFICAR_DATOS_CLIENTE = 20002;
 	 public static final int  ERROR_VERIFICAR_DATOS_ENVIADOS_BURO = 20003;
 	 public static final int  ERROR_NO_ENCONTRADO_REASONCODE = 20004;
 	 public static final int  ERROR_FOLIO_EMAIL_NO_ENCONTRADO_EN_BASE = 20005;
 	 public static final int  ERROR_DATOS_INCORRECTOS = 20006;
 	 public static final int  ERROR_AL_OBTENER_LOS_DATOS_EN_BASE = 20007;
 	 public static final int  ERROR_AL_GUARDAR_DATOS_EN_BASE = 20008;
 	 public static final int  ERROR_VALIDACION_INCORRECTA_DE_DATOS = 20009;
 	 public static final int  ERROR_NO_SE_ENCONTRARON_DATOS = 20010;
 	 public static final int   ERROR_FALTAN_DATOS = 20011;
 	 public static final int   ERROR_NUMERO_NO_ENCONTRADO = 20012;
 	 public static final int ERROR_TAMANIO_FOLIO_MENOR_IGUAL_13 = 20013;
 	 
 	 @SuppressWarnings({ "rawtypes", "unchecked" })
 	 public static ArrayList paisesEXT(){
 		 ArrayList paisesExt= new ArrayList();
 		 paisesExt.addAll(Arrays.asList("3","210","77","152","195","122"));
 		 return paisesExt;
 	 }
 	
}
