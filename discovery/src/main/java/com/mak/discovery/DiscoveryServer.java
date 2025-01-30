package com.mak.discovery;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServer {

	@Value("${server.port}")
	private String PORT;

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServer.class, args);
	}

	@PostConstruct
	public void init() {
		System.out.println("Discovery-Server Started at port: " + PORT);
	}

}
