package com.xworkz.Snapchat;

import com.xworkz.Snapchat.checkReg.SnapchatRegCheck;
import com.xworkz.Snapchat.snapchatDto.SnapchatDto;
import com.xworkz.Snapchat.constant.Gender;

public class SnapchatRunner {
    public static void main(String[] args) {
        SnapchatDto snapchatDto = new SnapchatDto();
        snapchatDto.setFirstName("mahesh");
        snapchatDto.setLastName("A V");
        snapchatDto.setUsername("mahesh2023");
        snapchatDto.setEmailAddress("mahesh.@example.com");
        snapchatDto.setPassword("maheshd123");
        snapchatDto.setGender(Gender.MALE);
        snapchatDto.setPhoneNo(9876543210L);
        snapchatDto.setDob("01/01/2003");
        snapchatDto.setCaptcha("abc123");

        SnapchatRegCheck snapchatRegCheck = new SnapchatRegCheck();
        snapchatRegCheck.userRegistered(snapchatDto);
    }
}
