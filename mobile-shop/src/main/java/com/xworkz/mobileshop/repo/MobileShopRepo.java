package com.xworkz.mobileshop.repo;

import com.xworkz.mobileshop.dto.MobileShopDto;

public interface MobileShopRepo {
boolean SaveMobileDetail(MobileShopDto dto);
boolean UpdateMobileData(int id, int mobilePrice);
boolean DeleteMobileData(int id);

}
