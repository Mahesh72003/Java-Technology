package com.xworkz.canvaapp;
import com.xworkz.canvaapp.userdata.CanvaUserDto;
import com.xworkz.canvaapp.signup.Canva;
public class CanvaRunner
{
        public static void main(String[] args) {
            CanvaUserDto user1 = new CanvaUserDto();
            user1.setEmail("mahesh@canva.com");
            user1.setUserName("designPro01");
            user1.setPassword("Canva@2025");
            user1.setFullName("Mahesh A V");
            user1.setAccountType("Pro");

            Canva canva = new Canva();
            if (canva.userSignUp(user1)) {
                System.out.println("Canva Registration Successful!");
                canva.getUserDetails(user1);

            } else {
                System.out.println("Canva Registration Failed!");
            }
        }
    }


