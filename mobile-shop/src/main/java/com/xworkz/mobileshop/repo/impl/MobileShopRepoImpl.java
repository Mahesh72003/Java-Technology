package com.xworkz.mobileshop.repo.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.Driver;
import com.xworkz.mobileshop.dto.MobileShopDto;
import com.xworkz.mobileshop.repo.MobileShopRepo;

public class MobileShopRepoImpl implements MobileShopRepo {
    @Override
    public boolean SaveMobileDetail(MobileShopDto dto) {
    boolean isDataSaved = false;
    try{
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop", "root", "v@12");
        String query = "insert into mobile_detail(mobile_name,mobile_type,mobile_price,mobile_color) values(?,?,?,?)";
    PreparedStatement preparedStatement = connection.prepareStatement(query);
    preparedStatement.setString(1, dto.getMobileName());
    preparedStatement.setString(2, dto.getMobileType());
    preparedStatement.setInt(3, dto.getMobilePrice());
    preparedStatement.setString(4, dto.getMobileColor());
    int noOfRowsAffected = preparedStatement.executeUpdate();
    preparedStatement.close();
    connection.close();
    if (noOfRowsAffected > 0) {
        isDataSaved = true;
    }
    }catch(Exception e){
        e.printStackTrace();
    }
    return isDataSaved;

    }

    @Override
    public boolean UpdateMobileData(int id, int mobilePrice) {
    boolean isDataUpdated = false;
    try{
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop", "root", "v@12");
    String query = "update mobile_detail set mobile_price = ? where mobile_id = ?";
    PreparedStatement preparedStatement = connection.prepareStatement(query);
    preparedStatement.setInt(1, mobilePrice);
    preparedStatement.setInt(2, id);
    int noOfRowsAffected = preparedStatement.executeUpdate();
    preparedStatement.close();
    connection.close();
    if (noOfRowsAffected > 0) {
        isDataUpdated = true;
    }
    }catch(Exception e){
        e.printStackTrace();
    }
    return isDataUpdated;
    }

    @Override
    public boolean DeleteMobileData(int id) {
        boolean isDataDeleted = false;
        try{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_shop", "root", "v@12");
        String query = "delete from mobile_detail where mobile_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        int noOfRowsAffected = preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        if (noOfRowsAffected > 0) {
            isDataDeleted = true;
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        return isDataDeleted;
    }
}
