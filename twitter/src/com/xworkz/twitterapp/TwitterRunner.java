package com.xworkz.twitterapp;

import com.xworkz.twitterapp.checkreg.TwitterRegCheck;
import com.xworkz.twitterapp.twitterdto.TwitterDto;

public class TwitterRunner {
    public static void main(String[] args) {

        TwitterDto twitterDto = new TwitterDto();
        twitterDto.setFirstName("Mahesh");
        twitterDto.setLastName("A V");
        twitterDto.setUsername("mahesh@2003");
        twitterDto.setEmailId("mahwsh@outlook.com");
        twitterDto.setPassword("mahesh123");
        twitterDto.setPhoneNumber(9876543210L);
        twitterDto.setCaptcha("jskj832");


        TwitterRegCheck twitterRegCheck = new TwitterRegCheck();
        twitterRegCheck.userRegistered(twitterDto);
        twitterRegCheck.getUserDetails(twitterDto);
    }
}
