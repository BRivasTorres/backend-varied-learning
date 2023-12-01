package com.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DeleteData {
    int id;

    public void deleteData() {
        try (Connection con = Database.getConnection()) {
            String idStr = JOptionPane.showInputDialog("Ingrese el id del libro que desea eliminar");
            id = Integer.parseInt(idStr);
            String query = "DELETE FROM libros WHERE id = " + id;
            PreparedStatement ps = con.prepareStatement(query);
            ps.executeUpdate();
            System.out.println("Datos eliminados");

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}