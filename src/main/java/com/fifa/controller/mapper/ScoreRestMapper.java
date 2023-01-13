package com.fifa.controller.mapper;

import com.fifa.controller.response.ScoreResponse;
import com.fifa.model.Score;
import org.springframework.stereotype.Component;

@Component
public class ScoreRestMapper {
    public ScoreResponse toRest(Score score){
        return ScoreResponse.builder()
                .id(score.getId())
                .score_a(score.getScore_a())
                .score_b(score.getScore_b())
                .id_player(score.getId_player())
                .isOnGoal(score.getIsOnGoal())
                .timeplay(score.getTimeplay())
                .build();
    }
}
