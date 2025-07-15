package com.xwork.planet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PlanetDto implements Comparable<PlanetDto> {
    private String name;
    private String size;
    private double distanceFromSun;
    private boolean hasMoons;
    private double orbitalPeriod;

    @Override
    public int compareTo(PlanetDto o) {
        return this.getName().compareTo(o.getName());
    }
}
