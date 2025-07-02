package com.xworkz.foodrestaurants.service;

import com.xworkz.foodrestaurants.dto.FoodMenuDto;

public interface FoodMenuService  {
    boolean ValidAndSave (FoodMenuDto dto);
    boolean UpdateFoodData(int id, int foodprice);
    boolean DeleteFoodData(int id);
}
