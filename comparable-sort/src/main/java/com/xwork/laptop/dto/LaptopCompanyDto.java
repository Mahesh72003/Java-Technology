package com.xwork.laptop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LaptopCompanyDto implements Comparable<LaptopCompanyDto> {
    private String brand;
    private String type;
    private String cpu;
    private String ram;
    private String storage;
    private String moduleNo;
    private int yearOfLaunch;
    private boolean isTouch;

    @Override
    public int compareTo(LaptopCompanyDto o) {
        return this.getBrand().compareTo(o.getBrand());
    }
}
