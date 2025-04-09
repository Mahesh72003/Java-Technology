package com.xworkz.myntra.checkReg;

import com.xworkz.myntra.myntraDto.MyntraDto;

public class MyntraRegCheck
{
MyntraDto myntraDto;
    public void userRegistered(MyntraDto myntraDto)
    {
        boolean isUserValid = userValid(myntraDto);
        if (isUserValid)
        {
            this.myntraDto=myntraDto;
            System.out.println("User registration successful!");
        }
        else
        {
            System.out.println("User registration failed.");
        }
    }

    public boolean userValid(MyntraDto myntraDto)
    {
        boolean isUserValid = false;
        boolean isNameValid = false;
        boolean isEmailValid = false;
        boolean isPhoneValid = false;
        boolean isPasswordValid = false;
        boolean isAgeValid = false;
        boolean isGenderValid = false;
        boolean isDobValid = false;
        boolean isLocationValid = false;
        boolean isAddressValid = false;
        boolean isPaymentMethodValid = false;


        if (myntraDto.getName() != null && !myntraDto.getName().isEmpty()) {
            isNameValid = true;
        } else {
            System.out.println("Please enter a valid name.");
        }


        if (myntraDto.getEmailAddress() != null && !myntraDto.getEmailAddress().isEmpty()) {
            isEmailValid = true;
        } else {
            System.out.println("Please enter a valid email address.");
        }


        if (myntraDto.getPhoneNo() > 0) {
            isPhoneValid = true;
        } else {
            System.out.println("Please enter a valid phone number.");
        }


        if (myntraDto.getPassword() != null && myntraDto.getPassword().length() >= 8) {
            isPasswordValid = true;
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }


        if (myntraDto.getAge() >= 0) {
            isAgeValid = true;
        } else {
            System.out.println("Please select a valid age");
        }


            if (myntraDto.getGender() != null) {
                isGenderValid = true;
            } else {
                System.out.println("Please select a valid gender.");
            }


            if (myntraDto.getDob() != null && !myntraDto.getDob().isEmpty()) {
                isDobValid = true;
            } else {
                System.out.println("Please enter a valid date of birth.");
            }


            if (myntraDto.getLocation() != null && !myntraDto.getLocation().isEmpty()) {
                isLocationValid = true;
            } else {
                System.out.println("Please enter a valid location.");
            }


            if (myntraDto.getAddress() != null && !myntraDto.getAddress().isEmpty()) {
                isAddressValid = true;
            } else {
                System.out.println("Please enter a valid address.");
            }


            if (myntraDto.getPaymentMethod() != null) {
                isPaymentMethodValid = true;
            } else {
                System.out.println("Please select a valid payment method.");
            }


            if (isNameValid && isEmailValid && isPhoneValid && isPasswordValid && isAgeValid && isGenderValid && isDobValid && isLocationValid && isAddressValid && isPaymentMethodValid) {
                isUserValid = true;
            }

            return isUserValid;
        }
    public void getUserDetails(MyntraDto myntraDto) {
        System.out.println("Myntra User Details:");
        System.out.println("Name: " + this.myntraDto.getName());
        System.out.println("Email Address: " + this.myntraDto.getEmailAddress());
        System.out.println("Phone Number: " + this.myntraDto.getPhoneNo());
        System.out.println("Password: " +this.myntraDto.getPassword());
        System.out.println("Age: " + this.myntraDto.getAge());
        System.out.println("Gender: " + this.myntraDto.getGender());
        System.out.println("Date of Birth: " + this.myntraDto.getDob());
        System.out.println("Location: " + this.myntraDto.getLocation());
        System.out.println("Address: " + this.myntraDto.getAddress());
        System.out.println("Payment Method: " + this.myntraDto.getPaymentMethod());
    }

}
