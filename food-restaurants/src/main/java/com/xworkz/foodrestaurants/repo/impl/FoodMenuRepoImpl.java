package com.xworkz.foodrestaurants.repo.impl;

import com.xworkz.foodrestaurants.dto.FoodMenuDto;
import com.xworkz.foodrestaurants.repo.FoodMenuRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FoodMenuRepoImpl implements FoodMenuRepo {
    @Override
    public boolean SavedFoodData(FoodMenuDto dto) {
        boolean SavedFoodData = false;
        int noOfRowsAffected;

        try {
            Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_restaurants", "root", "v@12");
            String query = "insert into food_menu (food_name,food_price,food_ingredients) values (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, dto.getFoodName());
            preparedStatement.setInt(2, dto.getFoodprice());
            preparedStatement.setString(3, dto.getFoodIngredients());
            noOfRowsAffected = preparedStatement.executeUpdate();
            
            preparedStatement.close();
            connection.close();
            if (noOfRowsAffected > 0) {
                SavedFoodData = true;   
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return SavedFoodData;
    }

    @Override
    public boolean UpdateFoodData(int id, int foodprice) {
        boolean UpdateFoodData = false;
        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/food_restaurants", "root", "v@12");
            String query = "update food_menu set food_price=? where food_menu_id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, foodprice);
            preparedStatement.setInt(2, id);
            int noOfRowsAffected = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
            if (noOfRowsAffected > 0) {
                UpdateFoodData = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return UpdateFoodData; 
    }

    @Override
    public boolean DeleteFoodData(int id) {
    boolean DeleteFoodData = false;
    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_restaurants", "root", "v@12");
        String query = "delete from food_menu where food_menu_id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        int noOfRowsAffected = preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        if (noOfRowsAffected > 0) {
            DeleteFoodData = true;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return DeleteFoodData;
    }


}
