package com.jdbc;

import javax.swing.JOptionPane;

public class Actions {
    public void selectedAction() {
        String[] options = { "Visualizar información", "Modificar Datos" };

        int result = JOptionPane.showOptionDialog(null, "Select an action to continue", "Select",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (result == 0) {
            ReadAction read = new ReadAction();
            read.ReadData();
        } else if (result == 1) {
            InsertAction insert = new InsertAction();
            insert.actions();
        }
    }
}
