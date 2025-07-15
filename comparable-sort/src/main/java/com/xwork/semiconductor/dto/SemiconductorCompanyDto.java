package com.xwork.semiconductor.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SemiconductorCompanyDto implements Comparable<SemiconductorCompanyDto> {
    private String name;
    private String location;
    private int foundedYear;
    private String CEO;
    private int employees;
    private double revenue;
    private double marketCap;
    private String mainProduct;
    private String headquarters;
    private boolean globalPresence;

    @Override
    public int compareTo(SemiconductorCompanyDto o) {
        return this.getName().compareTo(o.getName());
    }
}
