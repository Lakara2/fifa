package com.fifa.controller;

import com.fifa.controller.mapper.PlayRestMapper;
import com.fifa.controller.response.PlayResponse;
import com.fifa.service.PlayService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@AllArgsConstructor
public class PlayController {
    private final PlayService service;
    private final PlayRestMapper mapper;
    @GetMapping("/play")
    public List<PlayResponse> getMatch(){
        return service.getAll().stream().map(mapper::toRest).toList();
    }
}
