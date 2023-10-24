package com.jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ejercicio2 {
    public static java.sql.Connection connectToDB() {
        String url = "jdbc:mysql://localhost:3306/jugos2";
        String password = "Hola1234.";
        String user = "root";
        java.sql.Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
            String query = "SELECT * FROM tbproductos";
            PreparedStatement prepStatement = connection.prepareStatement(query);
            ResultSet result = prepStatement.executeQuery();

            while (result.next()) {
                String envase = result.getString("envase");
                System.out.println("Envase" + envase);
            }
        } catch (SQLException e) {
            System.out.println("Error " + e);
        }

        return connection;
    }

    public static void main(String[] args) {
        java.sql.Connection con = connectToDB();

        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println("Exception " + e);
        }
    }
}
