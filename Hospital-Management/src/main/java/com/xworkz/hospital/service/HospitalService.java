package com.xworkz.hospital.service;

import com.xworkz.hospital.dto.HospitalDto;

import java.sql.SQLException;

public interface HospitalService {

    public boolean validationAndSave(HospitalDto dto) ;

}
