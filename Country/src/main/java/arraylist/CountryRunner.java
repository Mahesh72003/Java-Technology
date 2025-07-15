package arraylist;

import java.util.*;

public class CountryRunner {
    public static void main(String[] args) {

        List<CountryDto> countryDtos = new ArrayList<>();
        countryDtos.add(new CountryDto("India",676986955653L,"nithya nanda"));

        for(CountryDto dtoInDtos : countryDtos){
            System.out.println(dtoInDtos);
        }
    }
}
