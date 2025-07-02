package com.xworkz.accountdetail.repo.impl;

import com.xworkz.accountdetail.dto.AccountDto;
import com.xworkz.accountdetail.repo.AccountRepo;

import java.sql.*;



public class AccountRepoImpl implements AccountRepo {

    @Override
    public boolean SaveAccountDetail(AccountDto dto) {
        boolean accountValid = false;
       int noOfRowsAffected;
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/account", "root", "v@12");
            String insertQuary ="insert into account_detail (account_name, account_type, address) value(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuary);
            preparedStatement.setString(1, dto.getAccountName());
            preparedStatement.setString(2, dto.getAccountType());
            preparedStatement.setString(3, dto.getAddress());
            noOfRowsAffected  =preparedStatement.executeUpdate();

            if (noOfRowsAffected > 0) {
                accountValid = true;
            }

            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return accountValid;
    }

    @Override
    public boolean UpdateAccountDetail(int id, String accountType) {
        boolean updateAccount = false;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/account", "root", "v@12");
            PreparedStatement preparedStatement = connection.prepareStatement("update account_detail set account_type = ? where account_idl = ?");
            preparedStatement.setString(1,accountType);
            preparedStatement.setInt(2,id);
            int noOfRowsAffected =  preparedStatement.executeUpdate();
            if (noOfRowsAffected > 0) {
                System.out.println("update is done "+ noOfRowsAffected);
                updateAccount = true;
            }
            else {
                System.out.println("did not update");
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return updateAccount;
    }
}
