package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadAction {
    public void ReadData() {
        SelectOptions selected = new SelectOptions();
        String action = selected.Select();
        String query = "SELECT " + action + " FROM tbproductos";

        ConnectionExpl con = new ConnectionExpl(action, query);
        Connection connection = con.connectToDatabase();

        try {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String nombre = resultSet.getString(action);
                System.out.println("Seleciono : " + nombre);
            }
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        } finally {
            con.closeConnection();
        }
    }
}
