package com.mak.users.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("api/v1/auth")
public class AuthController {

    @GetMapping
    public String getMethodName() {
        return new String("Auth Controller");
    }
    
    
}
