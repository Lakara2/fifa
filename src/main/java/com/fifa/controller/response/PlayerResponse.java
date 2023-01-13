package com.fifa.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PlayerResponse {
    private int id_player;
    private String name_player;
    private int nombre;
    private boolean isGardian;
}
