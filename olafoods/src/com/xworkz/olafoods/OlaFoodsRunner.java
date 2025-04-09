package com.xworkz.olafoods;
import com.xworkz.olafoods.userdata.OlaFoodsUserDto;
import com.xworkz.olafoods.signup.OlaFoods;
public class OlaFoodsRunner
{

        public static void main(String[] args) {
            OlaFoodsUserDto user1 = new OlaFoodsUserDto();
            user1.setEmail("mahesh@olafoods.com");
            user1.setPhoneNumber("9123456780");
            user1.setPassword("OlaEats@2024");
            user1.setFullName("mahesh");
            user1.setDeliveryArea("Whitefield, Bangalore");

            OlaFoods olaFoods = new OlaFoods();
            if (olaFoods.userSignUp(user1)) {
                System.out.println("OlaFoods Registration Successful!");
                olaFoods.getUserDetails(user1);
            } else {
                System.out.println("OlaFoods Registration Failed!");
            }
        }
    }


