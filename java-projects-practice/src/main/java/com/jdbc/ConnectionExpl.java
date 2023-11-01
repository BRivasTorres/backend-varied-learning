package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionExpl {

    String url = "jdbc:mysql://localhost:3306/jugos2";
    String usuario = "root";
    String contraseña = "Hola1234.";
    String action;
    String query;
    Connection connection;

    public ConnectionExpl() {

    }

    public ConnectionExpl(String action, String query) {
        this.action = action;
        this.query = query;
    }

    public ConnectionExpl(String query) {
        this.query = query;
    }

    Connection connectToDatabase() throws RuntimeException {
        // TODO cambiar el metodo connectToDB para que funcione tanto al leer como al
        // insertar data, ya que ahora solo funciona para leer data, devido a la
        // variable action
        try {
            connection = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String nombre = resultSet.getString(action);
                System.out.println("Seleciono : " + nombre);
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar " + e.getMessage());
        }
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}