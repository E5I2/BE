package com.example.e5i2.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Health Check", description = "API for checking the health of the application.")
@RestController
public class HealthCheckController {

    @Operation(summary = "Application Health Check", description = "Provides the operational status of the application.")
    @GetMapping("/health")
    public ResponseEntity<Map<String, String>> healthCheck() {
        Map<String, String> response = new TreeMap<>();
        response.put("status", "OK");
        response.put("message", "Health check successful");
        return ResponseEntity.ok(response);
    }
}
