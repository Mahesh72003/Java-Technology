package com.xworkz.pinterest;

import com.xworkz.pinterest.dto.PinterestDto;

public class PinterestRunner {
    public static void main(String[] args) {

        PinterestDto pinterestDto = new PinterestDto();
        pinterestDto.setArea("Rajajinagar");
        pinterestDto.setName("Mahesh A V");
        pinterestDto.setEmail("mahesh@gmail.com");
        pinterestDto.setUsername("mahesh@2003");
        pinterestDto.setPhoneNumber(890463382L);

        System.out.println(pinterestDto.toString());
    }
}
