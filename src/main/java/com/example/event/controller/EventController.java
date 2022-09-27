package com.example.event.controller;

import com.example.event.dto.ApiResponse;
import com.example.event.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/event")
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;

//    @GetMapping
//    public ResponseEntity<?> getAll(){
//        ApiResponse<List<>>
//    }

}
