package com.xworkz.myntra;

import com.xworkz.myntra.checkReg.MyntraRegCheck;
import com.xworkz.myntra.myntraDto.MyntraDto;
import com.xworkz.myntra.constant.Gender;
import com.xworkz.myntra.constant.PaymentMethod;

public class MyntraRunner {
    public static void main(String[] args) {

        MyntraDto myntraDto = new MyntraDto();
        myntraDto.setName("Mahesh A V");
        myntraDto.setEmailAddress("mahesh@test.com");
        myntraDto.setPhoneNo(890463382L);
        myntraDto.setPassword("mahesh@2003");
        myntraDto.setAge(22);
        myntraDto.setGender(Gender.MALE);
        myntraDto.setDob("06/07/2001");
        myntraDto.setLocation("Bangalore");
        myntraDto.setAddress("21 lig rajajinagar");
        myntraDto.setPaymentMethod(PaymentMethod.CREDIT);


        MyntraRegCheck myntraRegCheck = new MyntraRegCheck();
        myntraRegCheck.userRegistered(myntraDto);
    }
}
