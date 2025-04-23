package com.xworkz.bigbasket.checkReg;

import com.xworkz.bigbasket.bigbasketDto.BigBasketDto;

public class BigBasketRegCheck {

    public void userRegistered(BigBasketDto bigBasketDto) {
        boolean isUserValid = userValid(bigBasketDto);
        if (isUserValid) {
            System.out.println("User registration successful!");
        } else {
            System.out.println("User registration failed.");
        }
    }

    public boolean userValid(BigBasketDto bigBasketDto) {
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
        boolean isPaymentMethodValid = false;


        if (bigBasketDto.getFirstName() != null && !bigBasketDto.getFirstName().isEmpty()) {
            isFirstNameValid = true;
        } else {
            System.out.println("Please enter a valid first name.");
        }


        if (bigBasketDto.getLastName() != null && !bigBasketDto.getLastName().isEmpty()) {
            isLastNameValid = true;
        } else {
            System.out.println("Please enter a valid last name.");
        }


        if (bigBasketDto.getEmailAddress() != null && !bigBasketDto.getEmailAddress().isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Please enter a valid email address.");
        }


        if (bigBasketDto.getPhoneNo() > 0) {
            isPhoneValid = true;
        } else {
            System.out.println("Please enter a valid phone number.");
        }


        if (bigBasketDto.getPassword() != null && bigBasketDto.getPassword().length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }


        if (bigBasketDto.getGender() != null) {
            isGenderValid = true;
        } else {
            System.out.println("Please select a valid gender.");
        }


        if (bigBasketDto.getDob() != null && !bigBasketDto.getDob().isEmpty()) {
            isDobValid = true;
        } else {
            System.out.println("Please enter a valid date of birth.");
        }


        if (bigBasketDto.getLocation() != null && !bigBasketDto.getLocation().isEmpty()) {
            isLocationValid = true;
        } else {
            System.out.println("Please enter a valid location.");
        }


        if (bigBasketDto.getAddress() != null && !bigBasketDto.getAddress().isEmpty()) {
            isAddressValid = true;
        } else {
            System.out.println("Please enter a valid address.");
        }


        if (bigBasketDto.getPaymentMethod() != null) {
            isPaymentMethodValid = true;
        } else {
            System.out.println("Please select a valid payment method.");
        }


        if (isFirstNameValid && isLastNameValid && isEmailValid && isPhoneValid && isPasswordValid &&
                isGenderValid && isDobValid && isLocationValid && isAddressValid && isPaymentMethodValid) {
            isUserValid = true;
        }

        return isUserValid;
    }
}
