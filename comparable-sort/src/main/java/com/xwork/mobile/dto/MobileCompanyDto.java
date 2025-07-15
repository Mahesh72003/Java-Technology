package com.xwork.mobile.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MobileCompanyDto implements Comparable<MobileCompanyDto> {
    private String brand;
    private String model;
    private String processor;
    private String ram;
    private String storage;
    private String releaseDate;
    private boolean is5GEnabled;

    @Override
    public int compareTo(MobileCompanyDto o) {
        return this.getBrand().compareTo(o.getBrand());
    }
}
