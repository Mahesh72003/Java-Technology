package com.xworkz.zomato.checkReg;

import com.xworkz.zomato.zomatoDto.ZomatoDto;

public class ZomatoRegCheck {
ZomatoDto zomatoDto;
    public void userRegistered(ZomatoDto zomatoDto) {
        boolean isUserValid = userValid(zomatoDto);
        if (isUserValid) {
            this.zomatoDto=zomatoDto;
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed.");
        }
    }

    public boolean userValid(ZomatoDto zomatoDto) {
        boolean isUserValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isEmailValid = false;
        boolean isPhoneValid = false;
        boolean isPasswordValid = false;
        boolean isDobValid = false;
        boolean isLocationValid = false;
        boolean isAddressValid = false;


        if (zomatoDto.getFirstName() != null && !zomatoDto.getFirstName().isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Please enter a valid first name.");
        }


        if (zomatoDto.getLastName() != null && !zomatoDto.getLastName().isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Please enter a valid last name.");
        }


        if (zomatoDto.getEmailAddress() != null && !zomatoDto.getEmailAddress().isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Please enter a valid email address.");
        }


        if (zomatoDto.getPhoneNo() > 0) {
            isPhoneValid = true;
        } else {
            System.out.println("Please enter a valid phone number.");
        }


        if (zomatoDto.getPassword() != null && zomatoDto.getPassword().length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }


        if (zomatoDto.getDob() != null && !zomatoDto.getDob().isEmpty()) {
            isDobValid = true;
        } else {
            System.out.println("Please enter a valid date of birth.");
        }


        if (zomatoDto.getLocation() != null && !zomatoDto.getLocation().isEmpty()) {
            isLocationValid = true;
        } else {
            System.out.println("Please enter a valid location.");
        }


        if (zomatoDto.getAddress() != null && !zomatoDto.getAddress().isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Please enter a valid address.");
        }


        if (isFirstNameValid && isLastNameValid && isEmailValid && isPhoneValid && isPasswordValid && isDobValid && isLocationValid && isAddressValid) {
            isUserValid = true;
        }

        return isUserValid;
    }
    public void displayUserDetails(ZomatoDto user) {

        System.out.println("First Name: " + this.zomatoDto.getFirstName());
        System.out.println("Last Name: " + this.zomatoDto.getLastName());
        System.out.println("Email Address: " + this.zomatoDto.getEmailAddress());
        System.out.println("Phone Number: " + this.zomatoDto.getPhoneNo());
        System.out.println("Date of Birth: " + this.zomatoDto.getDob());
        System.out.println("Location: " + this.zomatoDto.getLocation());
        System.out.println("Address: " + this.zomatoDto.getAddress());
    }
}
