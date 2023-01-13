package com.fifa.service;

import com.fifa.model.Player;
import com.fifa.repository.PlayerRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerRepository repository;

    @Transactional
    public List<Player> getAllPlayers() {
        return repository.findAll();
    }
    /**
    //@Transactional
    public List<Player> createPlayer(List<Player> List) {
        return repository.saveAll(List);
    }
    //@Transactional
    public List<Player> updatePlayer(List<Player> List) {
        return repository.saveAll(List);
    }

    public Player deleteById(String nameplayer){
        Optional<Player> game = repository.findById(nameplayer);
        if(game.isPresent()){
            repository.deleteById(nameplayer);
            return game.get();
        }
        else {
            throw new RuntimeException("Player."+ nameplayer + "not found");
        }
    }
**/
}
