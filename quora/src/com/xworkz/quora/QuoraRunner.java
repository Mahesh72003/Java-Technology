package com.xworkz.quora;

import com.xworkz.quora.dto.QuoraDto;

public class QuoraRunner {
    public static void main(String[] args) {

        QuoraDto quoraDto = new QuoraDto();
        quoraDto.setFullName("Mahesh A V");
        quoraDto.setEmailId("mahesh@gmail.com");
        quoraDto.setUserId("mahesh@2003");
        quoraDto.setLocation("Rajajinagar");
        quoraDto.setPassword("mahesh123");

        System.out.println(quoraDto.toString());
    }
}
