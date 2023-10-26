package com.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionExpl {
    public java.sql.Connection connectToDatabase() throws RuntimeException {
        SelectOptions selected = new SelectOptions();
        String res = selected.Select();
        Actions action = new Actions();
        int act = action.selectedAction();

        // *Dependiendo del numero de la accion de act se llamara a la clase para leer o
        // para insertar datos */

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