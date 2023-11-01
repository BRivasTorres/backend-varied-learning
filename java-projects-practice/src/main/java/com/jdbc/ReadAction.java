package com.jdbc;

public class ReadAction {
    public void ReadData() {
        SelectOptions selected = new SelectOptions();
        String action = selected.Select();
        String query = "SELECT " + action + " FROM tbproductos";

        ConnectionExpl con = new ConnectionExpl(action, query);
        con.connectToDatabase();
        con.closeConnection();
    }
}
