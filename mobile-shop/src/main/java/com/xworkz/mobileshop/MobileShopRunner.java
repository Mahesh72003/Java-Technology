package com.xworkz.mobileshop;

import com.xworkz.mobileshop.dto.MobileShopDto;
import com.xworkz.mobileshop.service.MobileShopService;
import com.xworkz.mobileshop.service.impl.MobileShopServiceImpl;

public class MobileShopRunner {
    public static void main(String[] args) {
        MobileShopDto dto = new MobileShopDto();
        dto.setMobileName("Samsung");
        dto.setMobileType("Gameing");
        dto.setMobilePrice(10000);
        dto.setMobileColor("Black");
        
        MobileShopDto dto2 = new MobileShopDto();
        dto2.setMobileName("Iphone");
        dto2.setMobileType("Gameing");
        dto2.setMobilePrice(10000);
        dto2.setMobileColor("Black");
        
        MobileShopService service = new MobileShopServiceImpl();
        //service.validateAndSave(dto);
       // service.validateAndSave(dto2);
 //      service.updateData(1, 5000);
      service.deleteData(2);
    }
}
