package com.mak.users.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    
    @GetMapping
	public String getMethodName() {
		log.info("Users Service Called");
		return new String("This is Users Service 1");
	}
}
