package com.banamex.portal.microservice.ccapplicationsms.repository;

import java.util.HashMap;

public interface ApplicationRepository {
		public  HashMap<String, Object> getSys16(String nclient);
		public  HashMap<String, Object> getSys16Compuesto(String nclient, String fechanacimiento);
//		public Hashtable<String, Object>   geNumCteSistema16(String CtaNum);	
//		public InformacionClienteBean getSys16Solo(String nclient);
	}