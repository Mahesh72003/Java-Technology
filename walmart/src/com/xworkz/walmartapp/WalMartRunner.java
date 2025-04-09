package com.xworkz.walmartapp;

import com.xworkz.walmartapp.login.UserLogIn;
import com.xworkz.walmartapp.walmart.WalMartDto;

public class WalMartRunner {
    public static void main(String[] args) {


        WalMartDto walMartDto = new WalMartDto();
        walMartDto.setEmailId("booby6993@gmail.com");
        walMartDto.setFirstName("Mahesh");
        walMartDto.setLastName("A V");
        walMartDto.setPhoneNumber("1234567892");
        walMartDto.setPassWord("gfwq^*590");

        UserLogIn userLogIn = new UserLogIn();
        userLogIn.userLogIn(walMartDto);
        userLogIn.getUserDetails(walMartDto);


    }
}
