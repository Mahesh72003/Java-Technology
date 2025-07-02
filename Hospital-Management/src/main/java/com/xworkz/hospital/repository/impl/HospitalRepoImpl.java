package com.xworkz.hospital.repository.impl;

import com.xworkz.hospital.dto.HospitalDto;
import com.xworkz.hospital.repository.HospitalRepo;

import java.sql.*;

public class HospitalRepoImpl implements HospitalRepo {


    @Override
    public boolean hospitalDetailsSaved(HospitalDto dto) {
        System.out.println("repo started");
        boolean saveddata = false;
        System.out.println(dto);
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.0.129:3306/hospital_details","root","132713");
       // Statement statement = connection.createStatement();
            PreparedStatement statement= connection.prepareStatement("insert into hospital_info (hospitalName, address, phNo,hospitalType) values(?,?,?,?)");
            statement.setString(1,dto.getHospitalName());
            statement.setString(2, dto.getAddress());
            statement.setString(3, dto.getPhNo());
            statement.setString(4, dto.getHospitalType());

         int noofrowsaffected = statement.executeUpdate();
         if (noofrowsaffected>0)
         {
             System.out.println(noofrowsaffected);
             saveddata = true;
         }
         statement.close();
         connection.close();
        } catch (ClassNotFoundException  | SQLException e)
        {
            e.printStackTrace();
        }

        System.out.println("repo ended");
        return saveddata;
    }
}
