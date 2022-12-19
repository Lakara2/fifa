package com.fifa.controller.mapper;

import com.fifa.controller.response.TeamResponse;
import com.fifa.model.Team;
import org.springframework.stereotype.Component;

@Component
public class TeamRestMapper {
    public TeamResponse toRest(Team team){
        return TeamResponse.builder()
                .id(team.getId())
                .name(team.getName_team())
                .build();
    }
    public Team toDownDomain(TeamResponse rest){
        return Team.builder()
                .Name_team(rest.getName()).build();
    }
    public Team toUpDomain(TeamResponse Update){
        return Team.builder()
                .id(Update.getId())
                .Name_team(Update.getName())
                .build();
    }

}
