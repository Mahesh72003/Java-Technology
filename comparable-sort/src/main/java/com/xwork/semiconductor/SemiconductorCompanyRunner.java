package com.xwork.semiconductor;

import com.xwork.semiconductor.dto.SemiconductorCompanyDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SemiconductorCompanyRunner {
    public static void main(String[] args) {
        List<SemiconductorCompanyDto> companies = new ArrayList<>();

        companies.add(new SemiconductorCompanyDto("Intel", "USA", 1968, "Pat Gelsinger", 110000, 217.2, 2330.0, "Microprocessors", "Santa Clara, California", true));
        companies.add(new SemiconductorCompanyDto("TSMC", "Taiwan", 1987, "C.C. Wei", 50000, 57.4, 568.0, "Semiconductor Fabrication", "Hsinchu, Taiwan", true));
        companies.add(new SemiconductorCompanyDto("Samsung Electronics", "South Korea", 1969, "Kim Ki-nam", 320000, 211.8, 4200.0, "Semiconductors, Smartphones", "Seoul, South Korea", true));
        companies.add(new SemiconductorCompanyDto("NVIDIA", "USA", 1993, "Jensen Huang", 18000, 26.9, 874.0, "Graphics Processing Units", "Santa Clara, California", true));
        companies.add(new SemiconductorCompanyDto("AMD", "USA", 1969, "Lisa Su", 12000, 16.4, 153.0, "Microprocessors", "Santa Clara, California", true));
        companies.add(new SemiconductorCompanyDto("Qualcomm", "USA", 1985, "Cristiano Amon", 45000, 26.0, 199.0, "Mobile Communication", "San Diego, California", true));
        companies.add(new SemiconductorCompanyDto("Broadcom", "USA", 1961, "Hock Tan", 21000, 27.4, 282.0, "Semiconductors and Infrastructure Software", "San Jose, California", true));
        companies.add(new SemiconductorCompanyDto("Micron Technology", "USA", 1978, "Sanjay Mehrotra", 43000, 27.7, 125.0, "Memory and Storage Solutions", "Boise, Idaho", true));
        companies.add(new SemiconductorCompanyDto("Texas Instruments", "USA", 1930, "Rich Templeton", 35000, 18.0, 153.0, "Analog and Embedded Processing", "Dallas, Texas", true));
        companies.add(new SemiconductorCompanyDto("SK hynix", "South Korea", 1983, "Seok-hee Lee", 24000, 26.2, 93.0, "Memory Semiconductors", "Icheon, South Korea", true));

        System.out.println("Before Sorting:");
        for (SemiconductorCompanyDto company : companies) {
            System.out.println(company);
        }

        Collections.sort(companies);

        System.out.println("\nAfter Sorting:");
        for (SemiconductorCompanyDto company : companies) {
            System.out.println(company);
        }
    }
}
