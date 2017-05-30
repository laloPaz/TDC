package com.banamex.portal.microservice.ccapplicationsms.util;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class Messages {
	public static Properties es=new Properties();
	public static Properties en=new Properties();
	
	private static Logger log = Logger.getLogger(Messages.class);
	
	public static void inicializaMensajeLanguage() {
		
		 
		 ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			 try {
				es.load(classLoader.getResourceAsStream("messageEs.properties"));
			
			 } catch (IOException e) {
				// TODO Auto-generated catch block
				 System.out.println("--------------no cargo");
				e.printStackTrace();
			}
			 log.info("Ok load messageEs.properties");
		
		 
			 
		 
		 
    }
	

}
