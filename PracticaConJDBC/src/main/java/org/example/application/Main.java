package org.example.application;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "janka";
        try (Connection conn = DriverManager.getConnection(url, user, password);
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM  moto");
        ){
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("nombre"));
                System.out.println(resultSet.getString("marca"));
                System.out.println(resultSet.getDouble("cilindraje"));
                System.out.println(resultSet.getDouble("precio"));
            }
        } catch(SQLException e){
            e.printStackTrace();

        }
    }
}
