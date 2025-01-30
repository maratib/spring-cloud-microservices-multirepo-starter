package com.mak.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer {

	@Value("${server.port}")
	private String PORT;

	public static void main(String[] args) {
		SpringApplication.run(ConfigServer.class, args);
	}

	@PostConstruct
	public void init() {
		System.out.println("Config-Server Started at port: " + PORT);
	}

}
