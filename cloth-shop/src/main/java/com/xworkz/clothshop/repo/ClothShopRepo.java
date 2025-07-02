package com.xworkz.clothshop.repo;

import com.xworkz.clothshop.dto.ClothShopDto;

public interface ClothShopRepo {


    boolean SaveClothDetail(ClothShopDto dto);

    boolean UpdateClothData(int id, String clothType);

    boolean DeleteClothData(int id);
}
