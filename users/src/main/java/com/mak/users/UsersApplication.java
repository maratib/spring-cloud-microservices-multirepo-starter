package com.mak.users;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@Slf4j
public class UsersApplication {

	@Value("${server.port}")
	private String PORT;

	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);
	}

	@PostConstruct
	public void init() {
		log.info("Users Service Started at port: " + PORT);
	}
	


}
