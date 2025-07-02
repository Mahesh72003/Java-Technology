package com.xworkz.clothshop.service.impl;

import com.xworkz.clothshop.dto.ClothShopDto;
import com.xworkz.clothshop.repo.ClothShopRepo;
import com.xworkz.clothshop.repo.impl.ClothShopRepoImpl;
import com.xworkz.clothshop.service.ClothShopService;

public class ClothShopServiceImpl implements ClothShopService {
    ClothShopRepo clothShopRepo;
    public ClothShopServiceImpl() {
        clothShopRepo = new ClothShopRepoImpl();
    }
    @Override
    public boolean validateAndSave(ClothShopDto dto) {
        boolean isValidClothName = false;
        boolean isValidClothPrice = false;
        boolean isValidClothType = false;
        boolean isValidClothColor = false;
        boolean isValid = false;
        
        if (dto.getClothName()!=null && !dto.getClothName().isEmpty()) {
            isValidClothName = true;
        }
        if (dto.getClothPrice() > 0) {
            isValidClothPrice = true;
        }
        if (dto.getClothType()!=null && !dto.getClothType().isEmpty()) {
            isValidClothType = true;
        }
        if (dto.getClothColor()!=null && !dto.getClothColor().isEmpty()) {
            isValidClothColor = true;
        }
        if (isValidClothName && isValidClothPrice && isValidClothType && isValidClothColor) {
            isValid = clothShopRepo.SaveClothDetail(dto);
        }
        return isValid;
        
    
    }

    @Override
    public boolean updateData(int id, String ClothType) {
        boolean updateData = false;
        if (id > 0 && !ClothType.isEmpty() && ClothType != null) {
            updateData = clothShopRepo.UpdateClothData(id, ClothType);
        }
        return updateData;
    }

    @Override
    public boolean deleteData(int id) {
        boolean deleteData = false;
        if (id > 0) {
            deleteData = clothShopRepo.DeleteClothData(id);
        }
        return deleteData;
    }
}
