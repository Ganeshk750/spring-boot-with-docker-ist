package com.example.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.model.APIResponse;

@RestController
@RequestMapping(value = "/api/v1")
public class BaseController {

    @GetMapping(value = "/base")
    public ResponseEntity<APIResponse> readBaseResponse () {
        return ResponseEntity.ok(APIResponse.builder().message("API Running").build());
    }

    @GetMapping(value = "/appcheck")
    public ResponseEntity<APIResponse> checkApp () {
        return ResponseEntity.ok(APIResponse.builder().message("API Running Checked").build());
    }


}