package com.example.event.service;

import com.example.event.dto.ApiResponse;
import com.example.event.dto.UserDTO;
import com.example.event.model.User;
import com.example.event.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public ApiResponse<List<User>> getAll() {
        List<User> users = userRepository.findAll();
        if (users.isEmpty()) {
            return ApiResponse.<List<User>>builder().
                    message("Users not found!!!").
                    status(204).
                    success(false).
                    build();
        }
        return ApiResponse.<List<User>>builder().
                message("Users here!!!").
                status(200).
                success(true).
                data(users).
                build();
    }

    public ApiResponse<User> getOne(Long id){
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            return ApiResponse.<User>builder().
                    message("User here!!!").
                    status(200).
                    success(true).
                    data(userOptional.get()).
                    build();
        }
        return ApiResponse.<User>builder().
                message("User not found!!!").
                status(204).
                success(false).
                build();
    }

    public ApiResponse<User> add(User user) {
        User save = userRepository.save(user);
        return ApiResponse.<User>builder().
                message("User is registered").
                status(201).
                success(true).
                data(save).
                build();
    }

    public ApiResponse<?> edit(Long id, UserDTO dto) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isEmpty()) {
            return ApiResponse
                    .builder()
                    .message("User not found")
                    .success(false)
                    .build();
        }


        User user = userOptional.get();
        user.setFullName(dto.getFullName());
        user.setEmail(dto.getEmail());
        user.setFieldActivity(dto.getFieldActivity());

        userRepository.save(user);

        return ApiResponse
                .builder()
                .message("Saved")
                .success(true)
                .build();
    }


//    public ApiResponse<User> delete(User user){
//
//    }
}
