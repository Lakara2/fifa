package com.fifa.controller.mapper;

import com.fifa.controller.response.TeamResponse;
import com.fifa.model.Team;
import org.springframework.stereotype.Component;

@Component
public class TeamRestMapper {
    public TeamResponse toRest(Team team){
        return TeamResponse.builder()
                .id_team(team.getId())
                .name_team(team.getName_team())
                .Players(team.getPlayers())
                .Sponsor(team.getSponsor())
                .build();
    }
    /**
    public Team toDownDomain(TeamResponse rest){
        return Team.builder()
                .Name_team(rest.getName_team()).build();
    }
    public Team toUpDomain(TeamResponse Update){
        return Team.builder()
                .id_team(Update.getId_team())
                .Name_team(Update.getName_team())
                .build();
    }
**/
}
