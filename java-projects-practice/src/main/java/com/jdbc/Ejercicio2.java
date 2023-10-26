package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class Ejercicio2 {
    public static void main(String[] args) {
        ConnectionExpl con = new ConnectionExpl();
        Connection result = con.connectToDatabase();
        try {
            if (result != null) {
                result.close();
            }
        } catch (SQLException e) {
            System.out.println("Exception " + e);
        }
    }
}
