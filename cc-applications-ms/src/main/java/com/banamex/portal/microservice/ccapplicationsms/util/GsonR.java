package com.banamex.portal.microservice.ccapplicationsms.util;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;


public class GsonR {
	public static Gson gson;
	public static JsonParser parser; 
	
	private static Logger log = Logger.getLogger(GsonR.class); 
	
	public static void createGson(){
		gson = new Gson();
		parser = new JsonParser();
	}
	
	public static   String  toJson(Object obj){
		return gson.toJson(obj);
	}
	
	public static   HashMap<String, String>  fromJson(String obj){
		return (HashMap<String, String>) gson.fromJson(obj,  Map.class);
	}
	
	
	public static   Map<String,  String>  fromJsonMap(String json){
		 Map<String,  String> decoded = gson.fromJson(json, new TypeToken<Map<String,String>>(){}.getType());
		 return decoded;	 
		
	}
	
	public static   HashMap<String,  String>  fromJsonLabel(String json,String label){
		 JsonObject obj = parser.parse(json).getAsJsonObject();
		// HashMap<String,  String> decoded =new HashMap<String,  String>( gson.fromJson(obj.get(label), Map.class) );
		  
		 Type stringStringMap = new TypeToken<Map<String, String>>(){}.getType();
		 HashMap<String,String> decoded = gson.fromJson(obj.get(label), stringStringMap);
		 
		 
		 return decoded;	 
		
	}
	
}
