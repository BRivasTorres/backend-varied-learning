package com.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateData {
    public void insetData(String titulo, String autor, int paginas, String genero, String idioma) {
        try {
            Connection con = Database.getConnection();
            String query = "INSERT INTO libros (titulo, autor, paginas, genero, idioma) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, titulo);
            ps.setString(2, autor);
            ps.setInt(3, paginas);
            ps.setString(4, genero);
            ps.setString(5, idioma);

            ps.executeUpdate();
            System.out.println("Datos añadidos");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
