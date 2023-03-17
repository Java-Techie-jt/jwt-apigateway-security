package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SwiggyServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwiggyServiceRegistryApplication.class, args);
	}

}
