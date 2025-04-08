package com.xworkz.walmartapp.login;

import com.xworkz.walmartapp.walmart.WalMartDto;

public class UserLogIn {

        public boolean userLogIn(WalMartDto walMartDto) {
            boolean isLogIn = false;
            boolean var = customerProfileValidation(walMartDto);
            if (var == true)
                isLogIn = true;
            else
                System.out.println("Sign-in unsuccessful");
            return isLogIn;
        }

        public static boolean customerProfileValidation(WalMartDto walMartDto) {
            boolean customerValid = false;
            boolean isemailId = false;
            boolean isfirstName = false;
            boolean islastName = false;
            boolean isphoneNumber = false;
            boolean ispassWord = false;

            // Email ID validation
            String emailId = walMartDto.getEmailId();
            if (emailId != null && !emailId.isEmpty()) {
                isemailId = true;
            } else {
                System.out.println("Inappropriate emailId");
            }

            // First Name validation
            String firstName = walMartDto.getFirstName();
            if (firstName != null && !firstName.isEmpty() && firstName.length() > 4) {
                isfirstName = true;
            } else {
                System.out.println("First name is not valid");
            }

            // Last Name validation
            String lastName = walMartDto.getLastName();
            if (lastName != null && !lastName.isEmpty() && lastName.length() <= 2) {
                System.out.println("Invalid last name...");
            } else {
                islastName = true;
            }

            // Phone Number validation
            String phoneNumber = walMartDto.getPhoneNumber();
            if (phoneNumber != null && !phoneNumber.isEmpty() && phoneNumber.length() == 10) {
                isphoneNumber = true;
            } else {
                System.out.println("Please provide a proper phone number");
            }

            // Password validation
            String passWord = walMartDto.getPassWord();
            if (passWord != null &&  !passWord.isEmpty() && passWord.length() > 4 && passWord.length() < 10) {
                ispassWord = true;
            } else {
                System.out.println("Please enter a correct password");
            }

            // Final Validation
            if (isemailId == true && isfirstName == true && islastName == true && isphoneNumber == true && ispassWord == true) {
                customerValid = true;
            }

            return customerValid;
        }

    }


