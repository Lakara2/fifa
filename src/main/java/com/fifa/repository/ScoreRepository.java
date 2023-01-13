package com.fifa.repository;

import com.fifa.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository <Score, String>{
}
