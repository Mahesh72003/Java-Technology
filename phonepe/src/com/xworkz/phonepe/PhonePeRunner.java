package com.xworkz.phonepe;

import com.xworkz.phonepe.dto.PhonePeDto;

public class PhonePeRunner {
    public static void main(String[] args) {

        PhonePeDto phonePeDto = new PhonePeDto();
        phonePeDto.setFirstName("Mahesh ");
        phonePeDto.setLastName("A V");
        phonePeDto.setPhoneNumber(9876543210L);
        phonePeDto.setBankAccountNumber(1234567890123456L);
        phonePeDto.setEmailAddress("mahesh@test.com");
        phonePeDto.setGender("MALE");

        System.out.println(phonePeDto.toString());
    }
}
