package com.xworkz.ubereatsapp;
import com.xworkz.ubereatsapp.userdata.UberEatsUserDto;
import com.xworkz.ubereatsapp.signup.UberEats;
public class UberEatsRunner
{

        public static void main(String[] args) {
            UberEatsUserDto user1 = new UberEatsUserDto();
            user1.setEmail("mahesh@example.com");
            user1.setPhoneNumber("9998887776");
            user1.setFullName("mahesh");
            user1.setPassword("YummyFood@2024");
            user1.setDeliveryAddress("HSR Layout, Bangalore");

            UberEats uberEats = new UberEats();
            if (uberEats.userSignUp(user1)) {
                System.out.println("UberEats Registration Successful!");
            } else {
                System.out.println("UberEats Registration Failed!");
            }
            System.out.println(user1.toString());
        }
    }


