package com.xworkz.foodrestaurants.repo;

import com.xworkz.foodrestaurants.dto.FoodMenuDto;

public interface FoodMenuRepo {
    boolean SavedFoodData(FoodMenuDto dto);
    boolean UpdateFoodData(int id,int foodprice);
    boolean DeleteFoodData(int id);
}
