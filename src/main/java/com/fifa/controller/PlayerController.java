package com.fifa.controller;

import com.fifa.controller.mapper.PlayerRestMapper;
import com.fifa.controller.response.PlayerResponse;
import com.fifa.model.Player;
import com.fifa.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@AllArgsConstructor
public class PlayerController {
    private final PlayerService service;
    private final PlayerRestMapper mapper;

    @GetMapping("/player")
    public List<PlayerResponse> getPlayers(){
        return service.getAllPlayers().stream().map(mapper::toRest).toList();
    }
    /**
    //@PostMapping("/player")
    public List<PlayerResponse> createPlayer(@RequestBody List<PlayerResponse> toCreate) {
        List<Player> domain = toCreate.stream().map(mapper::toDownDomain).toList();
        return service.createPlayer(domain).stream().map(mapper::toRest).toList();
    }
    //@PutMapping("/player")
    public List<PlayerResponse> updatePlayer(@RequestBody List<PlayerResponse> toUpdate){
        return service.updatePlayer(toUpdate.stream().map(mapper::toUpDomain).toList()).stream().map(mapper::toRest).toList();
    }
    //@DeleteMapping(value = "/player/{playername}")
    public PlayerResponse deletePlayer(@PathVariable(name = "playername") String playername){
        return (mapper.toRest(service.deleteById(playername)));
    }**/
}
