package com.example.event.controller;

import com.example.event.dto.ApiResponse;
import com.example.event.model.User;
import com.example.event.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        ApiResponse<User> response = userService.getOne(id);
        return ResponseEntity.status(response.getStatus()).body(response);
    }

    @PostMapping()
    public ResponseEntity<?> add(@RequestBody User user){
        ApiResponse<User> response = userService.add(user);
        return ResponseEntity.status(response.getStatus()).body(response);
    }

}
