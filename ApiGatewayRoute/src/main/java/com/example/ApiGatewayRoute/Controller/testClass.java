package com.example.ApiGatewayRoute.Controller;

import jakarta.ws.rs.GET;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testClass {

    @GetMapping("/testApigateway")
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("Welcome to GeeksforGeeks");
    }

}
