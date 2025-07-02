package com.xworkz.foodrestaurants;

import com.xworkz.foodrestaurants.dto.FoodMenuDto;
import com.xworkz.foodrestaurants.service.FoodMenuService;
import com.xworkz.foodrestaurants.service.impl.FoodMenuServiceImpl;

public class FoodMenuRunner {
    public static void main(String[] args) {

        FoodMenuDto dto = new FoodMenuDto();
        dto.setFoodName("idle");
        dto.setFoodprice(30);
        dto.setFoodIngredients("rice");

        FoodMenuService foodMenuService = new FoodMenuServiceImpl();
       // foodMenuService.ValidAndSave(dto);
        //foodMenuService.UpdateFoodData(3, 35);
        foodMenuService.DeleteFoodData(2);


    }
}
