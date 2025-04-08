package com.xworkz.walmartapp;

import com.xworkz.walmartapp.login.UserLogIn;
import com.xworkz.walmartapp.walmart.WalMartDto;

public class WalMartRunner {
    public static void main(String[] args) {


        WalMartDto walMartDto = new WalMartDto();
        walMartDto.setEmailId("booby6993@gmail.com");
        walMartDto.setFirstName("Mahesh");
        walMartDto.setLastName("A V");
        walMartDto.setPhoneNumber("098765434");
        walMartDto.setPassWord("gfwq^*590");

        UserLogIn userLogIn = new UserLogIn();
        boolean ref = userLogIn.customerProfileValidation( walMartDto);

        if(ref == true){
            System.out.println("login successful");
        }
        else{
            System.out.println("login unsuccessful");
        }
    }
}
