package com.mak.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@SpringBootApplication
public class GatewayServer {

	@Value("${server.port}")
	private String PORT;

	public static void main(String[] args) {
		SpringApplication.run(GatewayServer.class, args);
	}

	@GetMapping
	public String index() {
		return "Gateway-Server";
	}
	public String getMethodName(@RequestParam String param) {
		return new String();
	}
	

	@PostConstruct
	public void init() {
		System.out.println("Gateway-Server Started at port: " + PORT);
	}

}
