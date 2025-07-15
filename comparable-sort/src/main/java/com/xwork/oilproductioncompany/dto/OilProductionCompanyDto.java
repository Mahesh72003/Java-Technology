package com.xwork.oilproductioncompany.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OilProductionCompanyDto implements Comparable<OilProductionCompanyDto> {
    private String companyName;
    private String origin;
    private double netWorth;
    private double oilProduction;
    private boolean isInSanctionedCountry;

    @Override
    public int compareTo(OilProductionCompanyDto o) {
        return Double.compare(this.getNetWorth(), o.getNetWorth());
    }
}
