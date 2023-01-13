package com.fifa.controller;

import com.fifa.controller.mapper.ScoreRestMapper;
import com.fifa.controller.response.ScoreResponse;
import com.fifa.service.ScoreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Controller
@RestController
@AllArgsConstructor
public class ScoreController {
    private final ScoreService service;
    private final ScoreRestMapper mapper;

    @GetMapping("/score")
    public List<ScoreResponse> getScore(){
        return service.getAll().stream().map(mapper::toRest).toList();
    }
}
