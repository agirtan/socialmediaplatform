package com.login.login.app2.controller;


import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingsController {
    @GetMapping
    public ResponseEntity<String>hello(){
        return ResponseEntity.ok("Hello from the API");
    }
    @GetMapping("/say-goodbye")

    public ResponseEntity<String>sayGoodBye(){
        return ResponseEntity.ok("Goodbye and see you late");
    }
}
