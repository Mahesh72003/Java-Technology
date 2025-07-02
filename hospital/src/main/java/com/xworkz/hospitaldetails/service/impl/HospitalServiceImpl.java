package com.xworkz.hospitaldetails.service.impl;

import com.xworkz.hospitaldetails.dto.HospitalDto;
import com.xworkz.hospitaldetails.repo.HospitalRepo;
import com.xworkz.hospitaldetails.repo.impl.HospitalRepoImpl;
import com.xworkz.hospitaldetails.service.HospitalService;

public class HospitalServiceImpl implements HospitalService {
    HospitalRepo hospitalRepo;
    public HospitalServiceImpl() {
    hospitalRepo = new HospitalRepoImpl();
    }
    @Override
    public boolean validAndSave(HospitalDto dto) {
        boolean pasientvalid = false;
        boolean PasientNameValid = false;
        boolean PasientGenderValid = false;
        boolean PasientAgeValid = false;
        boolean PasientAddressValid = false;

        if (dto.getPasientName() != null && !dto.getPasientName().isEmpty()) {
            PasientNameValid = true;
        }
        if (dto.getPasientGender() != null && !dto.getPasientGender().isEmpty()) {
            PasientGenderValid = true;
        }
        if (dto.getPasientAge() != null && !dto.getPasientAge().isEmpty()) {
            PasientAgeValid = true;
        }
        if (dto.getPasientAddress() != null && !dto.getPasientAddress().isEmpty()) {
            PasientAddressValid = true;
        }
        if (PasientNameValid && PasientGenderValid && PasientAgeValid && PasientAddressValid) {
            pasientvalid = hospitalRepo.SaveHospitalDetail(dto);
        }
        return pasientvalid;
    }
}
