package com.xwork.olympics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OlympicPlayerDto implements Comparable<OlympicPlayerDto> {
    private String playerName;
    private String gameName;
    private int rank;
    private String gender;
    private String place;
    private String stateOfOrigin;

    @Override
    public int compareTo(OlympicPlayerDto o) {
        return this.getPlayerName().compareTo(o.getPlayerName());
    }
}
