package com.xwork.cricket.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CricketMatchDto implements Comparable<CricketMatchDto> {
    private int year;
    private String place;
    private String opponentTeam;
    private String matchFormat;
    private String playerOfTheMatch;

    @Override
    public int compareTo(CricketMatchDto o) {
        return Integer.compare(this.getYear(), o.getYear());
    }
}
