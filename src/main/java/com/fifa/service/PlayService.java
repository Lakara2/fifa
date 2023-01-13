package com.fifa.service;

import com.fifa.model.Play;
import com.fifa.repository.PlayRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayService {
    private final PlayRepository repository;
    @Transactional
    public List<Play> getAll() {
        return repository.findAll();
    }
}
