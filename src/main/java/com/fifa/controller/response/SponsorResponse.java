package com.fifa.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SponsorResponse {
    private int id_sponsor;
    private String Name_sponsor;
}
