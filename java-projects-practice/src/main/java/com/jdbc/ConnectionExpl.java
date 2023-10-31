package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionExpl {

    String url;
    String usuario;
    String contraseña;
    String action;
    String query;
    Connection connection;

    public ConnectionExpl() {

    }

    public ConnectionExpl(String url, String usuario, String contraseña, String action, String query) {
        this.url = url;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.action = action;
        this.query = query;
    }

    Connection connectToDatabase() throws RuntimeException {

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