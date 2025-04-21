package com.xworkz.appleapp.register;
import com.xworkz.appleapp.apple.AppleDto;
public class AppleLogin {
AppleDto dto;
        public boolean verifySignIn(AppleDto dto) {
            boolean signedIn = false;
            boolean profileVerified = validateAppleUser(dto);
            if (profileVerified) {
                signedIn = true;
                System.out.println("Apple login successful!");
                this.dto=dto;
            } else {
                System.out.println("Apple login failed. Please try again.");
            }

            return signedIn;
        }

        public boolean validateAppleUser(AppleDto dto) {
            boolean isValid = false;

            boolean isAppleIdValid = false;
            boolean isUserNameValid = false;
            boolean isEmailValid = false;
            boolean isPasswordValid = false;
            boolean isConfirmPasswordValid = false;
            boolean isContactValid = false;

            if (dto.getAppleId() != null && !dto.getAppleId().isEmpty()) {
                isAppleIdValid = true;
            } else {
                System.out.println("Invalid Apple ID");
            }

            if (dto.getUserName() != null && dto.getUserName().length() > 3) {
                isUserNameValid = true;
            } else {
                System.out.println("Invalid User Name");
            }

            if (dto.getEmail() != null && dto.getEmail().contains("@")) {
                isEmailValid = true;
            } else {
                System.out.println("Invalid Email");
            }

            if (dto.getPassword() != null && dto.getPassword().length() >= 8) {
                isPasswordValid = true;
            } else {
                System.out.println("Password must be 8 characters or more");
            }

            if (dto.getConfirmPassword() != null && dto.getConfirmPassword().equals(dto.getPassword())) {
                isConfirmPasswordValid = true;
            } else {
                System.out.println("Passwords do not match");
            }

            if (String.valueOf(dto.getContactNumber()).length() == 10) {
                isContactValid = true;
            } else {
                System.out.println("Invalid contact number");
            }

            if (isAppleIdValid && isUserNameValid && isEmailValid && isPasswordValid && isConfirmPasswordValid && isContactValid) {
                isValid = true;
            }

            return isValid;
        }
        public void getUserDetails(AppleDto dto) {
        System.out.println("Apple ID: " +this.dto.getAppleId());
        System.out.println("Username: " + this.dto.getUserName());
        System.out.println("Email: " + this.dto.getEmail());
        System.out.println("Contact Number: " + this.dto.getContactNumber());
    }
    }




