package com.jdbc;

import javax.swing.JOptionPane;

public class InsertAction {
    public void insertData() {
        String[] options = { "Insert", "Delete", "Update" };
        int result = JOptionPane.showOptionDialog(null, "Select options", "Select", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        String query = options[result] + " FROM tbproductos";
        ConnectionExpl con = new ConnectionExpl(query);
        
        System.out.println("you have selected" + options[result]);
        
        
        con.connectToDatabase();
        con.closeConnection();
    }
}
