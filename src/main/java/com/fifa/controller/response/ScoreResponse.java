package com.fifa.controller.response;

import com.fifa.model.Play;
import com.fifa.model.Player;
import com.fifa.model.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ScoreResponse {
    private int id;
    private int score_a;
    private int score_b;
    private Instant timeplay;
    private Play id_play;
    private Player id_player;
    private Player isOnGoal;
}
