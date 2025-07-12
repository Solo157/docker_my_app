package com.myapp.app.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class MyAppApiController {

    @GetMapping("/health")
    public ResponseEntity<Map<String, String>> met() {
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("status", "OK"));
    }

}
