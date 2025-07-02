package com.xworkz.clothshop.repo.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.clothshop.dto.ClothShopDto;
import com.xworkz.clothshop.repo.ClothShopRepo;

public class ClothShopRepoImpl implements ClothShopRepo {
    @Override
    public boolean SaveClothDetail(ClothShopDto dto) {
        boolean isDataSaved = false;

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloth_shop", "root",
                    "v@12");
            String query = "insert into cloth_detail (cloth_name, cloth_price, cloth_type, cloth_color) values (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, dto.getClothName());
            preparedStatement.setInt(2, dto.getClothPrice());
            preparedStatement.setString(3, dto.getClothType());
            preparedStatement.setString(4, dto.getClothColor());
            int noOfRowsAffected = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
            if (noOfRowsAffected > 0) {
                isDataSaved = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isDataSaved;
    }

    @Override
    public boolean UpdateClothData(int id, String clothType) {
        boolean isDataUpdated = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloth_shop", "root",
                    "v@12");
            String query = "update cloth_detail set cloth_type = ? where cloth_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, clothType);
            preparedStatement.setInt(2, id);
            int noOfRowsAffected = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
            if (noOfRowsAffected > 0) {
                isDataUpdated = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isDataUpdated;
    }

    @Override
    public boolean DeleteClothData(int id) {
        boolean isDataDeleted = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloth_shop", "root",
                    "v@12");
            String query = "delete from cloth_detail where cloth_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            int noOfRowsAffected = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
            if (noOfRowsAffected > 0) {
                isDataDeleted = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isDataDeleted;
    }

}