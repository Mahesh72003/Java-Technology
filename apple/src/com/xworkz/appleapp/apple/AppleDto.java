package com.xworkz.appleapp.apple;

public class AppleDto {
    private String appleId;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private long contactNumber;

    // Setters
    public void setAppleId(String appleId) {
        this.appleId = appleId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Getters
    public String getAppleId() {
        return appleId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public long getContactNumber() {
        return contactNumber;
    }
}


