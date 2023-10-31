package com.jdbc;

public class ReadAction {
    public void ReadData() {
        SelectOptions selected = new SelectOptions();
        String action = selected.Select();

        String url = "jdbc:mysql://localhost:3306/jugos2";
        String usuario = "root";
        String contraseña = "Hola1234.";
        String query = "SELECT " + action + " FROM tbproductos";

        ConnectionExpl con = new ConnectionExpl(url, usuario, contraseña, action, query);
        con.connectToDatabase();
        con.closeConnection();
    }
}
