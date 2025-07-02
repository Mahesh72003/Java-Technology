package com.xworkz.hospital.service.impl;

import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.repository.HospitalRepo;
import com.xworkz.hospital.repository.impl.HospitalRepoImpl;
import com.xworkz.hospital.service.HospitalService;

import java.sql.SQLException;

public class HospitalServiceImpl implements HospitalService {

    HospitalRepo hospitalRepo;  //object creation

    public HospitalServiceImpl(){
        hospitalRepo = new HospitalRepoImpl();
    }

    @Override
    public boolean validationAndSave(HospitalDto dto) {
        System.out.println("valid started");
        boolean isHospitalName = false;
        boolean isHospitalAddress = false;
        boolean isHospitalPhno = false;
        boolean isHospitalType = false;
        boolean hospitalValidate = false;

        if(dto.getHospitalName()!= null && !dto.getHospitalName().isEmpty())
        {
            isHospitalName = true;
        }
        if(dto.getAddress()!= null && !dto.getAddress().isEmpty())
        {
            isHospitalAddress = true;
        }
        if(dto.getPhNo()!= null && !dto.getPhNo().isEmpty())
        {
            isHospitalPhno = true;
        }
        if(dto.getHospitalType()!=null && !dto.getHospitalType().isEmpty())
        {
            isHospitalType = true;
        }

        if(isHospitalName && isHospitalAddress && isHospitalPhno && isHospitalType) {
            hospitalValidate = hospitalRepo.hospitalDetailsSaved(dto);
            System.out.println(dto);
        }
        System.out.println("valid ended");
        return hospitalValidate;
    }
}
