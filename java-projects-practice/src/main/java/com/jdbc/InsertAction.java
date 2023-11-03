package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

// DELETE FROM tbproductos WHERE nombre = "nuevo valor 1";

public class InsertAction {
    public void actions() {
        String[] options = { "INSERT", "DELETE", "UPDATE" };
        JOptionPane.showOptionDialog(null, "Select options", "Select", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
    }

    public void insertData() {
        String query = "INSERT" + " INTO tbproductos (nombre, envase) VALUES (?, ?)";
        ConnectionExpl con = new ConnectionExpl(query);
        Connection connection = con.connectToDatabase();

        try {
            PreparedStatement declaracion = connection.prepareStatement(query);
            declaracion.setString(1, "nuevo valor 1");
            declaracion.setString(2, "nuevo vlaor 2");

            declaracion.executeUpdate();
            System.out.println("Informacion insertada");
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        } finally {
            con.closeConnection();
        }
    }

    public static void deleteData() {
        //TODO por medio del item del usuario eliminar dicho elemento con ese nombre dentro de la db
        String itemToDelete;
        String query = "DELETE FROM tbproductos WHERE nombre = " + "";
    }
}
