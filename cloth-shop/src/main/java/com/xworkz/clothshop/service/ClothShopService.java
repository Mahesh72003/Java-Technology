package com.xworkz.clothshop.service;

import com.xworkz.clothshop.dto.ClothShopDto;

public interface ClothShopService {
boolean validateAndSave(ClothShopDto dto);
boolean updateData(int id, String ClothType);
boolean deleteData(int id);

}
