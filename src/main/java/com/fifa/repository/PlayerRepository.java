package com.fifa.repository;

import com.fifa.model.player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<player, String> {
}
