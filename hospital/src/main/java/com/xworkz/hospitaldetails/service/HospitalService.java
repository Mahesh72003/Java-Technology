package com.xworkz.hospitaldetails.service;

import com.xworkz.hospitaldetails.dto.HospitalDto;

public interface HospitalService {
    boolean validAndSave(HospitalDto dto);
}
