package com.xworkz.aadhar;

import com.xworkz.aadhar.dto.AadharDto;
import com.xworkz.aadhar.exception.AadharEmailNotFoundException;
import com.xworkz.aadhar.exception.AadharNameNotFoundException;
import com.xworkz.aadhar.exception.AadharPhoneNotFoundException;

public class AadharRunner {
    public static void main(String[] args) {
        String name = GetNameFromAadharNumber("12345678901");
        System.out.println(name);
        String email = GetEmailFromAadharNumber("09379274929");
        System.out.println(email);
        try {
            long phoneNo = GetPhoneNumberFromAadharNumber("09379274929");
            System.out.println(phoneNo);
        } catch (AadharPhoneNotFoundException e) {
            e.printStackTrace();
        }

    }

    static AadharDto aadharDto = new AadharDto();

    static {
        aadharDto.setName("Mahesh A V");
        aadharDto.setAadharNumber("123456789012");
        aadharDto.setEmailAddress("mahesh@test.com");
        aadharDto.setPhoneNumber(890463382L);
        aadharDto.setLocation("Rajajinagar");

    }

    static String GetNameFromAadharNumber(String aadharNumber) {
        String name = null;
        try {
            if (aadharDto.getAadharNumber() == aadharNumber) {
                name = aadharDto.getName();
            } else {
                AadharNameNotFoundException aadharNameNotFoundException = new AadharNameNotFoundException(
                        "Aadhar Name did not found for the given Aadhar No " + aadharNumber);
                throw aadharNameNotFoundException;

            }
        } catch (AadharNameNotFoundException anne) {
            anne.printStackTrace();
        }

        return name;
    }

    static String GetEmailFromAadharNumber(String aadharNumber) {
        String email = null;
        try {
            if (aadharDto.getAadharNumber() == aadharNumber) {
                email = aadharDto.getEmailAddress();
            } else {
                AadharEmailNotFoundException aadharEmailNotFoundException = new AadharEmailNotFoundException("Aadhar Email did not found for the given Aadhar No " + aadharNumber);
                throw aadharEmailNotFoundException;
            }
        } catch (AadharEmailNotFoundException aene) {
            aene.printStackTrace();
        }
        return email;
    }
    static long GetPhoneNumberFromAadharNumber(String aadharNumber) throws AadharPhoneNotFoundException {
        long phoneNumber = 0;
        if (aadharDto.getAadharNumber() == aadharNumber) {
            phoneNumber = aadharDto.getPhoneNumber();
        }
        else
        {
            AadharPhoneNotFoundException aadharPhoneNotFoundException = new AadharPhoneNotFoundException("Aadhar Phone Number did not found for the given Aadhar No " + aadharNumber);
            throw aadharPhoneNotFoundException;
        }
        return phoneNumber;
    }
    static String
}