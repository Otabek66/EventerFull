package com.example.event.service;

import com.example.event.dto.ApiResponse;
import com.example.event.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
//    public ApiResponse<List<User>> getAll() {
//
//    }
}
