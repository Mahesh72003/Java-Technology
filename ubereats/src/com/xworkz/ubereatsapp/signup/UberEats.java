package com.xworkz.ubereatsapp.signup;
import com.xworkz.ubereatsapp.userdata.UberEatsUserDto;
public class UberEats
{
    UberEatsUserDto uberEatsUserDto;
        public boolean userSignUp(UberEatsUserDto user) {
            this.uberEatsUserDto=user;
            return userValidation(user);
        }

        public boolean userValidation(UberEatsUserDto user) {
            boolean isEmailValid = false;
            boolean isPhoneValid = false;
            boolean isNameValid = false;
            boolean isPasswordValid = false;
            boolean isAddressValid = false;

            if (user.getEmail() != null && user.getEmail().contains("@")) {
                isEmailValid = true;
            } else {
                System.out.println("Invalid Email. Please enter a valid email.");
            }

            if (user.getPhoneNumber() != null && user.getPhoneNumber().length() == 10) {
                isPhoneValid = true;
            } else {
                System.out.println("Invalid Phone Number. Please enter a 10-digit number.");
            }

            if (user.getFullName() != null && user.getFullName().length() > 0 && user.getFullName().length() <= 50) {
                isNameValid = true;
            } else {
                System.out.println("Invalid Full Name. Please provide a valid name.");
            }

            if (user.getPassword() != null && user.getPassword().length() >= 8 && user.getPassword().length() <= 16) {
                isPasswordValid = true;
            } else {
                System.out.println("Invalid Password. It should be 8 to 16 characters.");
            }

            if (user.getDeliveryAddress() != null && !user.getDeliveryAddress().isEmpty()) {
                isAddressValid = true;
            } else {
                System.out.println("Invalid Address. Please provide a valid delivery address.");
            }

            return isEmailValid && isPhoneValid && isNameValid && isPasswordValid && isAddressValid;
        }
        public void getUserDetails(UberEatsUserDto user) {
            System.out.println("User Details:");
            System.out.println("Full Name: " + this.uberEatsUserDto.getFullName());
            System.out.println("Email Address: " + this.uberEatsUserDto.getEmail());
            System.out.println("Phone Number: " + this.uberEatsUserDto.getPhoneNumber());
            System.out.println("Password: " + this.uberEatsUserDto.getPassword());
            System.out.println("Delivery Address: " + this.uberEatsUserDto.getDeliveryAddress());
    }
    }


