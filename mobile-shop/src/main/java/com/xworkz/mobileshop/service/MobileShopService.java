package com.xworkz.mobileshop.service;

import com.xworkz.mobileshop.dto.MobileShopDto;

public interface MobileShopService {
    boolean validateAndSave(MobileShopDto dto);
    boolean updateData(int id, int mobilePrice);
    boolean deleteData(int id);
}
