package com.xworkz.hospitaldetails.repo.impl;

import com.xworkz.hospitaldetails.dto.HospitalDto;
import com.xworkz.hospitaldetails.repo.HospitalRepo;

import java.sql.*;

public class HospitalRepoImpl implements HospitalRepo {
    @Override
    public boolean SaveHospitalDetail(HospitalDto dto) {
    boolean SaveHospitalDetail = false;
        try {
          //  Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "v@12");
            String insertData = "insert into patient_details (patient_name, patient_gender, patient_age, patient_address) value(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertData);
            preparedStatement.setString(1, dto.getPasientName());
            preparedStatement.setString(2,dto.getPasientGender());
            preparedStatement.setString(3,dto.getPasientAge());
            preparedStatement.setString(4,dto.getPasientAddress());
           int noOfAffatedrow = preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();
            if (noOfAffatedrow>0)
            {
                SaveHospitalDetail=true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return SaveHospitalDetail;
    }
}
