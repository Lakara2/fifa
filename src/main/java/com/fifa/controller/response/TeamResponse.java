package com.fifa.controller.response;

import com.fifa.model.Player;
import com.fifa.model.Sponsor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TeamResponse {
    private int id_team;
    private String name_team;
    private List<Player> Players ;
    private List<Sponsor> Sponsor;
}
