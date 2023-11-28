package com.crud;

import java.sql.Connection;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        CreateData createData = new CreateData();
        createData.createData();
    }
}
