package com.banamex.portal.microservice.ccapplicationsms.services;

import java.util.HashMap;

public interface ApplicationService {
	
	  /*
	   * Método que raliza llamados a distintos sistemas (S080, S016 , Database)
	   */
	  public  HashMap<String, Object> getSys16(String nclient);
	  /*
	   * Método que raliza llamados a distintos sistemas (S080, S016 , Database)
	   */
	  public  HashMap<String, Object> getSys16Compuesto(String nclient, String fechanacimiento);
	

}
