package com.banamex.portal.microservice.ccapplicationsms.callswitch;

import java.util.HashMap;

public interface S080SystemMs {
	HashMap <String,String> getPaises();
	HashMap<String, Object> getEstadoDelegacionColoniaCatalog(HashMap<String, Object> parametros);
}
