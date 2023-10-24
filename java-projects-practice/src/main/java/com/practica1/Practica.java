package com.practica1;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.jdbc.Connection;

public class Practica {
    public static java.sql.Connection ConnectToDatabase() {
        String url = "jdbc:mysql://localhost:3306/jugos2";
        String user = "root";
        String password = "Hola1234.";
        java.sql.Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM tbproductos";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String envase = resultSet.getString("envase");
                String sabor = resultSet.getString("sabor");
                int precio = resultSet.getInt("precio");
                System.out.println("Envase : " + envase + " Savor " + sabor + " Precio " + precio);
            }

        } catch (SQLException e) {
            System.out.println("An error in the connection has ocurred " + e.getMessage());
        }

        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Exception " + e);
        }

        return connection;
    }

    public static void main(String[] args) {
        java.sql.Connection connection = ConnectToDatabase();

    }
}