package com.xwork.tvmanufacturer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TVManufacturerDto implements Comparable<TVManufacturerDto>{
    private String companyName;
    private String countryOfOrigin;
    private int yearFounded;
    private String headquarters;
    private String ceo;
    private double netWorth;


    @Override
    public int compareTo(TVManufacturerDto o) {
        return this.getCompanyName().compareTo(o.getCompanyName());
    }
}
