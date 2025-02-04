package com.mak.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;



// @RestController
@SpringBootApplication
public class GatewayServer {

	@Value("${server.port}")
	private String PORT;

	public static void main(String[] args) {
		SpringApplication.run(GatewayServer.class, args);
	}

	// @GetMapping
	// public String index() {
	// 	return "Gateway-Server";
	// }
	

	@PostConstruct
	public void init() {
		System.out.println("Gateway-Server Started at port: " + PORT);
	}

}
