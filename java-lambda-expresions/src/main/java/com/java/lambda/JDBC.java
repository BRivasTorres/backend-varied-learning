package com.java.lambda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {
        // &Creatubg tge connection
        String url = "jdbc:postgresql://localhost/test";
        Connection = null;
        String sql = "";

        try {
            // *De esta manera se obtiene la connection en java, con una base de datos */
            conn = DriverManager.getConnection(url, "postgres", "postgres");
            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql);

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            conn.close();
        }
    }
}
