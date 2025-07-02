package com.xworkz.connectionapp;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionRunner {

    public static void main(String[] args) throws SQLException  {

        Connection  connection = DriverManager.
                 getConnection("jdbc:mysql://localhost:3306/e-comm","root","v@12");
         Statement statement  = connection.createStatement();

         int noOfRowsAffected  =     statement.
                 executeUpdate("insert into account (account_name) values('Mahesh') ");
        System.out.println(noOfRowsAffected);
        statement.close();
           connection.close();

    }
}


