package com.example.event.controller;

import com.example.event.dto.ApiResponse;
import com.example.event.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        ApiResponse<List<User>> response = userService.getAll();
        return ResponseEntity.status(response.getStatus()).body(response);
    }

}
