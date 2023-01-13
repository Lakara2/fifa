package com.fifa.controller.response;

import com.fifa.model.Score;
import com.fifa.model.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PlayResponse {
    private int id;
    private Instant dateplay;
    private String stadium;
    private Team id_team1;
    private Team id_team2;
    private List<Score> scores;
}
