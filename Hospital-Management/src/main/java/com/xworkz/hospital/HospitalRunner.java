package com.xworkz.hospital;

import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.service.HospitalService;
import com.xworkz.hospital.service.impl.HospitalServiceImpl;

import java.sql.SQLException;

public class HospitalRunner {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        HospitalDto dto = new HospitalDto();
        dto.setHospitalName("Mahesh");
        dto.setAddress("rajajinagar");
        dto.setPhNo("8904644069");
        dto.setHospitalType("public");

        System.out.println(dto);

        HospitalService hospitalService = new HospitalServiceImpl();
        hospitalService.validationAndSave(dto);
        System.out.println("main ended");
            }
        }

