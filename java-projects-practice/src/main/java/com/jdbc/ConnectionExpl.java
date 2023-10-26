package com.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionExpl {
    public java.sql.Connection connectToDatabase() {
        SelectOptions selected = new SelectOptions();
        String res = selected.Select();

        java.sql.Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/jugos2";
        String usuario = "root";
        String contraseña = "Hola1234.";

        try {
            connection = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = connection.createStatement();
            String query = "SELECT " + res + " FROM tbproductos";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String nombre = resultSet.getString(res);
                System.out.println("Seleciono : " + nombre);
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar " + e.getMessage());
        }

        return connection;
    }
}
