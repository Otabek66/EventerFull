package com.example.event.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ApiResponse<T> {
    private String  message;

    private boolean success;

    private int status;

    private T data;
}
