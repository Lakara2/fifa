package com.fifa.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@AllArgsConstructor
public class PingController {
    @GetMapping(value = "/")
    public String ping(){
        return "Hello";
    }
}
