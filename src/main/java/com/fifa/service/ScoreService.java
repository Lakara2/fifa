package com.fifa.service;

import com.fifa.model.Score;
import com.fifa.repository.ScoreRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ScoreService {
    private final ScoreRepository repository;
    @Transactional
    public List<Score> getAll() {
        return repository.findAll();
    }
}
