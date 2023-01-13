package com.fifa.controller;

import com.fifa.controller.mapper.TeamRestMapper;
import com.fifa.controller.response.TeamResponse;
import com.fifa.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Controller
@RestController
@AllArgsConstructor
public class TeamController {
    private final TeamService service1;
    private final TeamRestMapper mapper1;
    /*
    private final PlayerService service2;
    private final SponsorService service3;
    private final PlayerRestMapper mapper2;
    private final SponsorRestMapper mapper3;
    */

    @GetMapping("/team")
    public List<TeamResponse> getTeams(){
        return service1.getAllTeams().stream().map(mapper1::toRest).toList();
    }
    /*
    //@PostMapping("/team")
    public List<TeamResponse> createTeam(@RequestBody List<TeamResponse> toCreate) {
        List<Team> domain = toCreate.stream().map(mapper::toDownDomain).toList();
        return service.createTeam(domain).stream().map(mapper::toRest).toList();
    }
    //@PutMapping("/team")
    public List<TeamResponse> updateTeam(@RequestBody List<TeamResponse> toUpdate){
        return service.updateTeam(toUpdate.stream().map(mapper::toUpDomain).toList()).stream().map(mapper::toRest).toList();
    }
    //@DeleteMapping(value = "/team/{teamId}")
    public TeamResponse deleteTeam(@PathVariable(name = "teamId") Integer teamId){
        return (mapper.toRest(service.deleteById(teamId)));
    }
    */
}
