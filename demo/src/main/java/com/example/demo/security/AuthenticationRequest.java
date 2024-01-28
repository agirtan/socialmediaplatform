package com.example.demo.security;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class AuthenticationRequest {

    private String email;
    private String password;
}
