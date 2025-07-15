package com.xwork.country;

import com.xwork.country.dto.CountryDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountryRunner {
    public static void main(String[] args) {
        List<CountryDto> countryDtos = new ArrayList<CountryDto>();
        countryDtos.add(new CountryDto(1, "India", "New Delhi", 1400000000L, "Narendra Modi", "INR", 3.73, "Asia", 3287263L, true, false, false, "+91"));
        countryDtos.add(new CountryDto(2, "United States", "Washington D.C.", 331000000L, "Donald Trump", "USD", 25.5, "North America", 9833520L, true, false, false, "+1"));
        countryDtos.add(new CountryDto(3, "Germany", "Berlin", 83000000L, "Olaf Scholz", "Euro", 4.5, "Europe", 357022L, true, true, false, "+49"));
        countryDtos.add(new CountryDto(4, "Nigeria", "Abuja", 206000000L, "Bola Tinubu", "Naira", 0.45, "Africa", 923768L, false, false, true, "+234"));
        countryDtos.add(new CountryDto(5, "Japan", "Tokyo", 125000000L, "Fumio Kishida", "Yen", 4.9, "Asia", 377975L, true, false, false, "+81"));
        countryDtos.add(new CountryDto(6, "Brazil", "Brasília", 213000000L, "Luiz Inácio Lula da Silva", "Real", 2.0, "South America", 8515767L, false, false, false, "+55"));
        countryDtos.add(new CountryDto(7, "France", "Paris", 67000000L, "Emmanuel Macron", "Euro", 3.0, "Europe", 551695L, true, true, false, "+33"));
        countryDtos.add(new CountryDto(8, "South Africa", "Pretoria", 60000000L, "Cyril Ramaphosa", "Rand", 0.35, "Africa", 1221037L, false, false, true, "+27"));
        countryDtos.add(new CountryDto(9, "Australia", "Canberra", 26000000L, "Anthony Albanese", "AUD", 1.7, "Oceania", 7692024L, true, false, false, "+61"));
        countryDtos.add(new CountryDto(10, "Canada", "Ottawa", 38000000L, "Mark Carney", "CAD", 2.2, "North America", 9984670L, true, false, false, "+1"));

        System.out.println("before the sorting");
        for (CountryDto dto : countryDtos)
        {
            System.out.println(dto);
        }

        Collections.sort(countryDtos);
        System.out.println("after the sorting");
        for (CountryDto dto : countryDtos){
            System.out.println(dto);
        }
    }
}
