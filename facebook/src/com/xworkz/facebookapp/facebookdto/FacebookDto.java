package com.xworkz.facebookapp.facebookdto;

import com.xworkz.facebookapp.constant.Gender;
import com.xworkz.facebookapp.constant.Language;

public class FacebookDto {
    private String firstName;
    private String lastName;
    private Gender gender;
    private Language language;
    private long mobileNumber;
    private String emailAddress;
    private String Dob;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Language getLanguage() {
        return language;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setDob(String dob) {
        Dob = dob;
    }

    public String getDob() {
        return Dob;
    }
}
