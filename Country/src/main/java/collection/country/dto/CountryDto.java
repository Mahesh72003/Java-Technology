package collection.country.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CountryDto  {

    private int countryId;
    private String countryName;
    private String countryCapitalCity;
    private long countryPopulation;
    private String countryPMName;
    private String countryCurrency;
    private double gdp;
    private String continent;
    private long landSize;
    private boolean isDeveloped;
    private boolean isInEuropeanUnion;
    private boolean isInAfricanUnion;
    private String countryTeleNo;


}
