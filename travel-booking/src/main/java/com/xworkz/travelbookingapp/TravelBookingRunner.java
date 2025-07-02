package com.xworkz.travelbookingapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static java.lang.Class.forName;

public class TravelBookingRunner {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        int noOfRowsAffected;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_booking","root","v@12");
        Statement statement = connection.createStatement();
        noOfRowsAffected= statement.executeUpdate("insert into booking_details(name, date_of_journer, source, destination)value ('mahesh', '2023-03-01', 'chennai', 'bangalore')");
       // noOfRowsAffected = statement.executeUpdate(  "UPDATE booking_details SET name = 'Haridra' WHERE booking_id = 1");
        //noOfRowsAffected = statement.executeUpdate("Delete from booking_details where name = 'Haridra'");
        System.out.println(noOfRowsAffected);
        statement.close();
        connection.close();
    }
}
