package com.xworkz.facebookapp;

import com.xworkz.facebookapp.check.FacebookRegCheck;
import com.xworkz.facebookapp.constant.Gender;
import com.xworkz.facebookapp.constant.Language;
import com.xworkz.facebookapp.facebookdto.FacebookDto;

public class FacebookRunner {
    public static void main(String args[]) {

        FacebookDto facebookDto = new FacebookDto();
        facebookDto.setFirstName("Mahesh");
        facebookDto.setLastName("A V");
        facebookDto.setGender(Gender.Male);
        facebookDto.setLanguage(Language.kannada);
        facebookDto.setMobileNumber(8904644069L);
        facebookDto.setEmailAddress("mahesh@test.com");
        facebookDto.setDob("06-07-2025");

        FacebookRegCheck facebookRegCheck = new FacebookRegCheck();
        facebookRegCheck.userRegisterd(facebookDto);


        System.out.println(facebookDto.toString());
    }
}
