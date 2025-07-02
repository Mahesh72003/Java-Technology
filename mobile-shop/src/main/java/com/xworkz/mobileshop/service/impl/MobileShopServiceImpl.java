package com.xworkz.mobileshop.service.impl;

import com.xworkz.mobileshop.dto.MobileShopDto;
import com.xworkz.mobileshop.repo.MobileShopRepo;
import com.xworkz.mobileshop.repo.impl.MobileShopRepoImpl;
import com.xworkz.mobileshop.service.MobileShopService;


public class MobileShopServiceImpl implements MobileShopService {

MobileShopRepo mobileShopRepo;
public MobileShopServiceImpl() {
    mobileShopRepo = new MobileShopRepoImpl();
}
    @Override
    public boolean validateAndSave(MobileShopDto dto) {
    boolean isValidMobileName = false;
    boolean isValidMobilePrice = false;
    boolean isValidMobileType = false;
    boolean isValidMobileColor = false;
    boolean isValid = false;
    if (dto.getMobileName() != null && !dto.getMobileName().isEmpty()) {
        isValidMobileName = true;
    }
    if (dto.getMobilePrice() > 0) {
        isValidMobilePrice = true;
    }
    if (dto.getMobileType() != null && !dto.getMobileType().isEmpty()) {
        isValidMobileType = true;
    }
    if (dto.getMobileColor() != null && !dto.getMobileColor().isEmpty()) {
        isValidMobileColor = true;
    }
    if (isValidMobileName && isValidMobilePrice && isValidMobileType && isValidMobileColor) {
        isValid = mobileShopRepo.SaveMobileDetail(dto);
    }
        return isValid;
    }

    @Override
    public boolean updateData(int id, int mobilePrice) {
    boolean updateData = false;
    if (id > 0 &&  mobilePrice > 0) {
    updateData=mobileShopRepo.UpdateMobileData(id, mobilePrice);    
    }
        return updateData;
    }

    @Override
    public boolean deleteData(int id) {
    boolean deleteData = false;
    if(id > 0) {
        deleteData = mobileShopRepo.DeleteMobileData(id);
    }
        return deleteData;
    }
}
