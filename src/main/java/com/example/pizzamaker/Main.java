package com.example.pizzamaker;

import com.example.pizzamaker.util.SQLConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection = SQLConnector.getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("insert into `table` values (0,1,1,true)");
            int count = preparedStatement.executeUpdate();
        }catch(SQLException exception){
            exception.printStackTrace();
        }

    }
}
