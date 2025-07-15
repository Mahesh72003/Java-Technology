package com.xwork.os.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OperatingSystemDto implements Comparable<OperatingSystemDto> {
    private String name;
    private int year;
    private String whoBuilt;
    private String type;
    private String useType;
    private double size;
    private String ramRequired;

    @Override
    public int compareTo(OperatingSystemDto o) {
        return Integer.compare(this.getYear(), o.getYear());  // Sorting by year
    }
}
