package com.banamex.portal.microservice.ccapplicationsms.util;

import java.util.Properties;

public class PropertiesJcs {

	public static boolean  cache_Meter = true;
	public static int      cache_contador = 0;
	
	public static int      cache_estado_SINCACHE = 0;
	public static int      cache_estado_CONCACHE = 1;
	public static int      cache_estado_actual = cache_estado_CONCACHE;
	

	public static int  MaxintentosPuerto = 6;
	public static int  MaxLifeSeconds = 180;
	public static int  TcpListenerPort = 25015;
	
	public static Properties web(int MaxLifeSeconds,int TcpListenerPort){
		Properties props = new Properties();
		props.setProperty("jcs.region.CacheManager", "LTCP");
		props.setProperty("jcs.region.CacheManager.cacheattributes", "org.apache.jcs.engine.CompositeCacheAttributes");
		props.setProperty("jcs.region.CacheManager.cacheattributes.MaxObjects", "150000");
		props.setProperty("jcs.region.cacheattributes.UseLateral", "true");
		props.setProperty("jcs.region.cacheattributes.UseRemote", "false");
		props.setProperty("jcs.region.cacheattributes.UseDisk", "false");
		props.setProperty("jcs.region.CacheManager.cacheattributes.MemoryCacheName", "org.apache.jcs.engine.memory.lru.LRUMemoryCache");
		props.setProperty("jcs.region.CacheManager.cacheattributes.UseMemoryShrinker", "true");
		props.setProperty("jcs.region.CacheManager.cacheattributes.MaxMemoryIdleTimeSeconds", "200");
		props.setProperty("jcs.region.cacheattributes.ShrinkerIntervalSeconds", "60");
		props.setProperty("jcs.region.CacheManager.elementattributes", "org.apache.jcs.engine.ElementAttributes");
		props.setProperty("jcs.region.CacheManager.elementattributes.MaxLifeSeconds", MaxLifeSeconds+"");
		props.setProperty("jcs.region.CacheManager.elementattributes.IsEternal", "false");
		props.setProperty("jcs.region.CacheManager.elementattributes.IsSpool", "false");
		props.setProperty("jcs.region.CacheManager.elementattributes.IsRemote", "true");
		props.setProperty("jcs.region.CacheManager.elementattributes.IsLateral", "true");
		props.setProperty("jcs.auxiliary.LTCP", "org.apache.jcs.auxiliary.lateral.socket.tcp.LateralTCPCacheFactory");
		props.setProperty("jcs.auxiliary.LTCP.attributes", "org.apache.jcs.auxiliary.lateral.socket.tcp.TCPLateralCacheAttributes");
		props.setProperty("jcs.auxiliary.LTCP.attributes.TcpListenerPort", TcpListenerPort+"");
		props.setProperty("jcs.auxiliary.LTCP.attributes.PutOnlyMode", "true");
		props.setProperty("jcs.auxiliary.LTCP.attributes.AllowGet", "false");
		props.setProperty("jcs.auxiliary.LTCP.attributes.UdpDiscoveryAddr", "224.0.0.251");
		props.setProperty("jcs.auxiliary.LTCP.attributes.UdpDiscoveryPort", "6782");
		props.setProperty("jcs.auxiliary.LTCP.attributes.UdpDiscoveryEnabled", "true");
		//# Remote RMI Cache set up to failover
		props.setProperty("jcs.auxiliary.RFailover", "org.apache.jcs.auxiliary.remote.RemoteCacheFactory");
		props.setProperty("jcs.auxiliary.RFailover.attributes", "org.apache.jcs.auxiliary.remote.RemoteCacheAttributes");
		props.setProperty("jcs.auxiliary.RFailover.attributes.RemoteTypeName", "LOCAL");
		props.setProperty("jcs.auxiliary.RFailover.attributes.GetOnly", "false");

		return props;
	}
	
	public static boolean  pongoEnCache(){
		return PropertiesJcs.cache_Meter;
	}
	
	
	public static void  incrementaContador(){
		/*PropertiesJcs.cache_contador++;
	 
		if(cache_estado_actual==cache_estado_CONCACHE){
			if(cache_contador==20){
				cache_estado_actual = cache_estado_SINCACHE;
				cache_Meter  = false;
				cache_contador = 0;
			}
		}
		
		
		if(cache_estado_actual==cache_estado_SINCACHE){
			if(cache_contador==30){
				cache_estado_actual = cache_estado_CONCACHE;
				cache_Meter  = true;
				cache_contador = 0;
			}
		}
		*/
		cache_Meter  = false;
	}
	
	
}
