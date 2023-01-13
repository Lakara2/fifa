package com.fifa.controller.mapper;

import com.fifa.controller.response.SponsorResponse;
import com.fifa.model.Sponsor;
import org.springframework.stereotype.Component;

@Component
public class SponsorRestMapper {
    public SponsorResponse toRest(Sponsor sponsor){
        return SponsorResponse.builder()
                .id_sponsor(sponsor.getId())
                .Name_sponsor(sponsor.getName_sponsor())
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
