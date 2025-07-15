package com.xwork.satellite.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class IndianSatelliteDto implements Comparable<IndianSatelliteDto> {
    private String name;
    private String useFor;
    private String launchDate;
    private String launchVehicle;
    private double weight;
    private String orbitType;
    private String operator;
    private String status;
    private String communicationType;

    @Override
    public int compareTo(IndianSatelliteDto o) {
        return this.getName().compareTo(o.getName());
    }
}
