package com.xworkz.hospitaldetails.repo;

import com.xworkz.hospitaldetails.dto.HospitalDto;

public interface HospitalRepo {
    boolean SaveHospitalDetail(HospitalDto dto);
}
