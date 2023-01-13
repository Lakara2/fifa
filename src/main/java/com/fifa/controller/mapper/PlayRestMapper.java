package com.fifa.controller.mapper;

import com.fifa.controller.response.PlayResponse;
import com.fifa.model.Play;
import org.springframework.stereotype.Component;

@Component
public class PlayRestMapper {
    public PlayResponse toRest(Play play){
        return PlayResponse.builder()
                .id(play.getId())
                .dateplay(play.getDateplay())
                .stadium(play.getStadium())
                .id_team1(play.getId_team1())
                .id_team2(play.getId_team2())
                .scores(play.getScores())
                .build();
    }
}
