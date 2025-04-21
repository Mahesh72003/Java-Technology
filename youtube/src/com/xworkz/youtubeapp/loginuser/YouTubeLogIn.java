package com.xworkz.youtubeapp.loginuser;
import com.xworkz.youtubeapp.youtube.YouTubeDto;

public class YouTubeLogIn {
YouTubeDto youTubeDto;
        public boolean startSignIn(YouTubeDto dto) {
            boolean signedIn = false;

            boolean validated = verifyAccount(dto);
            if (validated) {
                signedIn = true;
                this.youTubeDto=dto;
                System.out.println("Welcome to YouTube!");
            } else {
                System.out.println("Login Failed. Please check your details.");
            }

            return signedIn;
        }

        public boolean verifyAccount(YouTubeDto dto) {
            boolean validAccount = false;

            boolean emailValid = false;
            boolean nameValid = false;
            boolean pwdValid = false;
            boolean confirmValid = false;
            boolean mobileValid = false;

            String email = dto.getUserEmail();
            if (email != null && !email.isEmpty() && email.contains("@")) {
                emailValid = true;
            } else {
                System.out.println("Invalid email address");
            }

            String channel = dto.getChannelName();
            if (channel != null && !channel.isEmpty()) {
                nameValid = true;
            } else {
                System.out.println("Channel name is invalid");
            }

            String pwd = dto.getPassword();
            if (pwd != null && !pwd.isEmpty() && pwd.length() >= 6) {
                pwdValid = true;
            } else {
                System.out.println("Password is weak");
            }

            String confirmPwd = dto.getConfirmPassword();
            if (confirmPwd != null && confirmPwd.equals(pwd)) {
                confirmValid = true;
            } else {
                System.out.println("Passwords do not match");
            }

            long mobile = dto.getMobile();
            if (String.valueOf(mobile).length() == 10) {
                mobileValid = true;
            } else {
                System.out.println("Invalid mobile number");
            }

            if (emailValid && nameValid && pwdValid && confirmValid && mobileValid) {
                validAccount = true;
            }

            return validAccount;
        }
        public void displayUserDetails(YouTubeDto user) {

            System.out.println("User Details:");
            System.out.println("Email: " + this.youTubeDto.getUserEmail());
            System.out.println("Channel Name: " + this.youTubeDto.getChannelName());
            System.out.println("Mobile: " + this.youTubeDto.getMobile());
    }

    }


