package com.xworkz.netflixapp.signin;
import com.xworkz.netflixapp.netflix.NetflixDto;
public class NetflixUserSignin {
NetflixDto netflixDto;
        public boolean attemptLogin(NetflixDto dto) {
            boolean isLoggedIn = false;

            boolean isValidUser = validateUserDetails(dto);
            if (isValidUser) {
                netflixDto=dto;
                isLoggedIn = true;
                System.out.println("Netflix login successful!");
            } else {
                System.out.println("Netflix login failed. Please check your details.");
            }

            return isLoggedIn;
        }

        public boolean validateUserDetails(NetflixDto dto) {
            boolean isValid = false;

            boolean isUserIdValid = false;
            boolean isUserNameValid = false;
            boolean isEmailValid = false;
            boolean isPasswordValid = false;
            boolean isConfirmPasswordValid = false;
            boolean isMobileValid = false;

            if (dto.getUserId() != null && !dto.getUserId().isEmpty()) {
                isUserIdValid = true;
            } else {
                System.out.println("User ID is invalid");
            }

            if (dto.getUserName() != null && dto.getUserName().length() >= 3) {
                isUserNameValid = true;
            } else {
                System.out.println("User Name is invalid");
            }

            if (dto.getEmail() != null && dto.getEmail().contains("@")) {
                isEmailValid = true;
            } else {
                System.out.println("Invalid Email format");
            }

            if (dto.getPassword() != null && dto.getPassword().length() >= 8) {
                isPasswordValid = true;
            } else {
                System.out.println("Password should be at least 8 characters");
            }

            if (dto.getConfirmPassword() != null && dto.getConfirmPassword().equals(dto.getPassword())) {
                isConfirmPasswordValid = true;
            } else {
                System.out.println("Passwords do not match");
            }

            if (String.valueOf(dto.getMobileNumber()).length() == 10) {
                isMobileValid = true;
            } else {
                System.out.println("Mobile number must be 10 digits");
            }

            if (isUserIdValid && isUserNameValid && isEmailValid && isPasswordValid && isConfirmPasswordValid && isMobileValid) {
                isValid = true;
            }

            return isValid;
        }
    public void getUserDetails(NetflixDto netflixDto) {
        System.out.println("Netflix User Details:");
        System.out.println("User ID: " + this.netflixDto.getUserId());
        System.out.println("User Name: " + this.netflixDto.getUserName());
        System.out.println("Email: " + this.netflixDto.getEmail());
        System.out.println("Password: " + this.netflixDto.getPassword());
        System.out.println("Confirm Password: " + this.netflixDto.getConfirmPassword());
        System.out.println("Mobile Number: " +this.netflixDto.getMobileNumber());
    }

}



