package com.xworkz.appleapp;
import com.xworkz.appleapp.apple.AppleDto;
import com.xworkz.appleapp.register.AppleLogin;

public class AppleRunner {


        public static void main(String[] args) {

            AppleDto user = new AppleDto();
            user.setAppleId("appleuser2025");
            user.setUserName("Mahesh");
            user.setEmail("mahesh@apple.com");
            user.setPassword("apple@2025");
            user.setConfirmPassword("apple@2025");
            user.setContactNumber(9876543210L);

           AppleLogin login = new AppleLogin();

            login.verifySignIn(user);

            login.getUserDetails(user);
        }
    }


