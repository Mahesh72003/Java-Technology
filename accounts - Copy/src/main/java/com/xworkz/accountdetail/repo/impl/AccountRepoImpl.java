package com.xworkz.accountdetail.repo.impl;

import com.xworkz.accountdetail.dto.AccountDto;
import com.xworkz.accountdetail.repo.AccountRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountRepoImpl implements AccountRepo {
    @Override
    public boolean SaveAccountDetail(AccountDto dto) {
        boolean accountValid = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/account", "root", "v@12");
            Statement statement = connection.createStatement();
            int noOfRowsAffected = statement
                    .executeUpdate("insert into account_detail (account_name, account_type, address) value('"
                            + dto.getAccountName() + "'," +
                            "'" + dto.getAccountType() + "'," +
                            "'" + dto.getAddress() + "')");
            if (noOfRowsAffected > 0) {
                accountValid = true;
            }
            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
        }

        return accountValid;
    }
}
