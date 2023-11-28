package com.crud;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws SQLException {
        CreateData createData = new CreateData();
        String nombre = JOptionPane.showInputDialog("Ingrese el titulo: ");
        String autor = JOptionPane.showInputDialog("Ingrese el autor: ");
        String paginasStr = JOptionPane.showInputDialog("Ingrese el número de páginas: ");
        int paginas = Integer.parseInt(paginasStr);
        String genero = JOptionPane.showInputDialog("Ingrese el genero: ");
        String idioma = JOptionPane.showInputDialog("Ingrese el idioma: ");

        createData.insetData(nombre, autor, paginas, genero, idioma);
    }
}
