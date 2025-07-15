package com.xwork.telecomcompany.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TelecomCompanyDto implements Comparable<TelecomCompanyDto> {
    private String companyName;
    private String owner;
    private String countryOfOrigin;
    private String latestConnection;
    private long numberOfUsers;

    @Override
    public int compareTo(TelecomCompanyDto o) {
        return this.getCompanyName().compareTo(o.getCompanyName());
    }
}
