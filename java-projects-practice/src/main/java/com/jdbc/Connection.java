package com.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection {
    public static java.sql.Connection connectToDatabase() {
        java.sql.Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/jugos2";
        String usuario = "root";
        String contraseña = "Hola1234.";

        try {
            connection = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = connection.createStatement();
            String query = "SELECT envase FROM tbproductos";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String nombre = resultSet.getString("envase");
                System.out.println("Envase " + nombre);
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar " + e.getMessage());
        }

        return connection;
    }

    public static void main(String[] args) {
        java.sql.Connection connection = connectToDatabase();

        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("eror" + e.getMessage());
        }
    }
}
