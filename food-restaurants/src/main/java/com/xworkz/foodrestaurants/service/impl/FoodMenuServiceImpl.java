package com.xworkz.foodrestaurants.service.impl;

import com.xworkz.foodrestaurants.dto.FoodMenuDto;
import com.xworkz.foodrestaurants.repo.FoodMenuRepo;
import com.xworkz.foodrestaurants.repo.impl.FoodMenuRepoImpl;
import com.xworkz.foodrestaurants.service.FoodMenuService;

public class FoodMenuServiceImpl implements FoodMenuService {
    FoodMenuRepo foodMenuRepo;
    public FoodMenuServiceImpl() {
        foodMenuRepo = new FoodMenuRepoImpl();
    }
    @Override
    public boolean ValidAndSave(FoodMenuDto dto) {
        boolean ValidFoodName=false;
        boolean ValidFoodPrice = false;
        boolean ValidFoodIngredients = false;
        boolean ValidAndSave = false;
        
        if(dto.getFoodName()!=null && !dto.getFoodName().isEmpty())
        {
            ValidFoodName = true;
        }
        if (dto.getFoodprice() > 0) {
            ValidFoodPrice = true;
        }
        if (dto.getFoodIngredients() != null && !dto.getFoodIngredients().isEmpty()) {
            ValidFoodIngredients = true;
        }
        if (ValidFoodName && ValidFoodPrice && ValidFoodIngredients) {
            ValidAndSave = foodMenuRepo.SavedFoodData(dto);
        }
        
    return ValidAndSave;
    }

    @Override
    public boolean UpdateFoodData(int id, int foodprice) {
        boolean UpdateFoodData = false;
        if(id>0 && foodprice>0)
        {
            UpdateFoodData = foodMenuRepo.UpdateFoodData(id, foodprice);
        }
        return UpdateFoodData;

    }

    @Override
    public boolean DeleteFoodData(int id) {
    boolean DeleteFoodData = false;
    if (id > 0) {
        DeleteFoodData = foodMenuRepo.DeleteFoodData(id);
        
    }
        return DeleteFoodData;
    }
}
