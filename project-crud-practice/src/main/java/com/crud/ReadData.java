package com.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class ReadData {
    private String[] options = { "Titulo", "Autor", "Paginas", "Genero", "Idioma", "*" };

    public int selectDataOption() {
        return JOptionPane.showOptionDialog(null, "Select the data to read", "Select",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
    }

    public void readData() {
        int seleted = selectDataOption();

        try (Connection con = Database.getConnection()) {
            String sql = "SELECT " + options[seleted] + " FROM libros";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet result = ps.executeQuery();

            ResultSetMetaData rsmd = (ResultSetMetaData) result.getMetaData();
            int columnCount = rsmd.getColumnCount();

            while (result.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    String columName = rsmd.getColumnName(i);
                    String name = result.getString(i);
                    System.out.println(columName + " : " + name);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
