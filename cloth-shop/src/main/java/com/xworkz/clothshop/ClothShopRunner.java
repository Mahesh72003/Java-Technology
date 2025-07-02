package com.xworkz.clothshop;

import com.xworkz.clothshop.dto.ClothShopDto;
import com.xworkz.clothshop.service.ClothShopService;
import com.xworkz.clothshop.service.impl.ClothShopServiceImpl;

public class ClothShopRunner {
public static void main(String[] args) {
    
    ClothShopDto dto = new ClothShopDto();
    dto.setClothName("Shirt");
    dto.setClothType("Formal");
    dto.setClothPrice(1000);
    dto.setClothColor("Black");
    
    ClothShopDto dto2 = new ClothShopDto();
    dto2.setClothName("Tshirt");
    dto2.setClothType("Casual");
    dto2.setClothPrice(500);
    dto2.setClothColor("White");
    
    ClothShopService service = new ClothShopServiceImpl();
   // service.validateAndSave(dto);
    // service.validateAndSave(dto2);
    //service.updateData(1, "Casual");
   service.deleteData(2);
    
    

}
}
