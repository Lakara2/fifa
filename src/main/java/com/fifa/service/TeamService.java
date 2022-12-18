package com.fifa.service;

import com.fifa.model.Team;
import com.fifa.repository.TeamRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TeamService {
    private final TeamRepository repository;

    @Transactional
    public List<Team> getAllTeams() {
        return repository.findAll();
    }
    @Transactional
    public List<Team> createTeam(List<Team> teamList) {
        return repository.saveAll(teamList);
    }
    @Transactional
    public List<Team> updateTeam(List<Team> teamList) {
        return repository.saveAll(teamList);
    }

    public Team deleteById(int teamId){
        Optional<Team> equipe = repository.findById(teamId);

        if(equipe.isPresent()){
            repository.deleteById(teamId);
            return equipe.get();
        }
        else {
            throw new RuntimeException("Team."+ teamId + "not found");
        }
    }

}
