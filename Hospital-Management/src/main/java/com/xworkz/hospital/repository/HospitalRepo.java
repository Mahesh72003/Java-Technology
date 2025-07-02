package com.xworkz.hospital.repository;

import com.xworkz.hospital.dto.HospitalDto;

import java.sql.SQLException;

public interface HospitalRepo {

    boolean hospitalDetailsSaved(HospitalDto dto) ;

}
