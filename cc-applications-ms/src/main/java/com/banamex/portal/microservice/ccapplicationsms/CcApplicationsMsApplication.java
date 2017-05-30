package com.banamex.portal.microservice.ccapplicationsms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan("com.banamex.portal.*")
public class CcApplicationsMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcApplicationsMsApplication.class, args);
	}
}
