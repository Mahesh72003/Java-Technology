package com.xworkz.hospitaldetails;

import com.xworkz.hospitaldetails.dto.HospitalDto;
import com.xworkz.hospitaldetails.service.HospitalService;
import com.xworkz.hospitaldetails.service.impl.HospitalServiceImpl;

public class HospitalRunner {
    public static void main(String[] args) {

        HospitalDto dto = new HospitalDto();
        dto.setPasientName("Mahesh");
        dto.setPasientGender("Male");
        dto.setPasientAge("25");
        dto.setPasientAddress("Bangalore");

        System.out.println(dto);

        HospitalService hospitalService = new HospitalServiceImpl();
        boolean dataSave =hospitalService.validAndSave(dto);
        if (dataSave)
        {
            System.out.println("all done");
        }
        else
        {
            System.out.println("did not stored");
        }



    }
}
