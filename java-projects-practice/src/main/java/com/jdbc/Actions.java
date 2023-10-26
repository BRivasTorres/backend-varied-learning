package com.jdbc;

import javax.swing.JOptionPane;

public class Actions {
    public int selectedAction() {
        int action;
        String[] options = { "Visualizar información", "Insertar Datos" };

        int result = JOptionPane.showOptionDialog(null, "Select an action to continue", "Select",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        return action = result;
    }
}
