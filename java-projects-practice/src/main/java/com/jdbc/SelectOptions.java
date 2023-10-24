package com.jdbc;

import javax.swing.JOptionPane;

public class SelectOptions {
    public static void Select() {
        String[] options = { "Productos", "Nombre", "Envase", "Sabor", "Precio" };
        JOptionPane.showOptionDialog(null, "Seleccione una opción", "Seleccione", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

    }
}
