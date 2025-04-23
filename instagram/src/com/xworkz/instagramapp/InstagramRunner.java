package com.xworkz.instagramapp;

import com.xworkz.instagramapp.checkreg.InstagramRegCheck;
import com.xworkz.instagramapp.instagramdto.InstagramDto;

public class InstagramRunner {
    public static void main(String[] args) {

        InstagramDto instagramDto = new InstagramDto();
        instagramDto.setFirstName("Mahesh");
        instagramDto.setLastName("A V");
        instagramDto.setDob("06/07/2003");
        instagramDto.setEmail("mahesh@gmail.com");
        instagramDto.setUsername("mahesh2003");
        instagramDto.setPhoneNumber(8904644069L);
        instagramDto.setPassword("mahesh@2003");

        InstagramRegCheck instagramRegCheck = new InstagramRegCheck();
        instagramRegCheck.userRegisterd(instagramDto);
        System.out.println(instagramDto.toString());
    }
}
