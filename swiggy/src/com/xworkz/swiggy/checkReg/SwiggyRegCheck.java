package com.xworkz.swiggy.checkReg;

import com.xworkz.swiggy.swiggyDto.SwiggyDto;

public class SwiggyRegCheck {

    public void userRegistered(SwiggyDto swiggyDto) {
        boolean isUserValid = userValid(swiggyDto);
        if (isUserValid) {
            System.out.println("User registration successful!");
        }
        else {
            System.out.println("User registration failed.");
        }
    }

    public boolean userValid(SwiggyDto swiggyDto) {
        boolean isUserValid = false;
        boolean isFirstNameValid = false;
        boolean isLastNameValid = false;
        boolean isEmailValid = false;
        boolean isPhoneValid = false;
        boolean isPasswordValid = false;
        boolean isGenderValid = false;
        boolean isDobValid = false;
        boolean isLocationValid = false;
        boolean isAddressValid = false;


        if (swiggyDto.getFirstName() != null && !swiggyDto.getFirstName().isEmpty()) {
            isFirstNameValid = true;
        }
        else {
            System.out.println("Please enter a valid first name.");
        }


        if (swiggyDto.getLastName() != null && !swiggyDto.getLastName().isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Please enter a valid last name.");
        }


        if (swiggyDto.getEmailAddress() != null && !swiggyDto.getEmailAddress().isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Please enter a valid email address.");
        }


        if (swiggyDto.getPhoneNo() > 0) {
            isPhoneValid = true;
        } else {
            System.out.println("Please enter a valid phone number.");
        }


        if (swiggyDto.getPassword() != null && swiggyDto.getPassword().length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }


        if (swiggyDto.getGender() != null) {
            isGenderValid = true;
        } else {
            System.out.println("Please select a valid gender.");
        }


        if (swiggyDto.getDob() != null && !swiggyDto.getDob().isEmpty()) {
            isDobValid = true;
        } else {
            System.out.println("Please enter a valid date of birth.");
        }


        if (swiggyDto.getLocation() != null && !swiggyDto.getLocation().isEmpty()) {
            isLocationValid = true;
        } else {
            System.out.println("Please enter a valid location.");
        }


        if (swiggyDto.getAddress() != null && !swiggyDto.getAddress().isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Please enter a valid address.");
        }


        if (isFirstNameValid && isLastNameValid && isEmailValid && isPhoneValid && isPasswordValid && isGenderValid && isDobValid && isLocationValid && isAddressValid) {
            isUserValid = true;
        }

        return isUserValid;
    }
}
