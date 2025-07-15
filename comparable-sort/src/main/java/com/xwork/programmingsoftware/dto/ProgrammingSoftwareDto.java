package com.xwork.programmingsoftware.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProgrammingSoftwareDto implements Comparable<ProgrammingSoftwareDto> {
    private String name;
    private String companyName;
    private int yearOfLaunch;
    private String whoBuilt;
    private String type;
    private String latestVersion;
    private boolean isOpenSource;

    @Override
    public int compareTo(ProgrammingSoftwareDto o) {
        return Integer.compare(this.getYearOfLaunch(), o.getYearOfLaunch());
    }
}
