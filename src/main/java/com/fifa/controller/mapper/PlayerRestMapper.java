package com.fifa.controller.mapper;

import com.fifa.controller.response.PlayerResponse;
import com.fifa.model.Player;
import org.springframework.stereotype.Component;

@Component
public class PlayerRestMapper {
    public PlayerResponse toRest(Player player){
        return PlayerResponse.builder()
                .id_player(player.getId())
                .name_player(player.getName_player())
                .nombre(player.getNombre())
                .build();
    }/**
    public Player toDownDomain(PlayerResponse rest){
        return Player.builder()
                .Name_player(rest.getName_player()).build();
    }
    public Player toUpDomain(PlayerResponse Update){
        return Player.builder()
                .id_player(Update.getId_player())
                .Name_player(Update.getName_player())
                .build();
    }
**/
}
