package com.xwork.biscuit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BiscuitCompanyDto implements Comparable<BiscuitCompanyDto> {
    private String name;
    private String owner;
    private String countryOfOrigin;
    private int yearFounded;
    private String mostComesSellBiscuit;
    private long noOfUnitsSold;

    @Override
    public int compareTo(BiscuitCompanyDto o) {
        return this.getName().compareTo(o.getName());
    }
}
