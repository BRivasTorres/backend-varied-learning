package com.jdbc;

import javax.swing.JOptionPane;

public class SelectOptions {
    public String Select() {
        String res = "";
        String[] options = { "Productos", "Nombre", "Envase", "Sabor", "Precio" };
        int result = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Seleccione",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if (result >= 0) {
            res = options[result];
        } else {
            JOptionPane.showMessageDialog(null, "Porfavor selecione un valor correcto", "Seleccione una opción",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return res;
    }
}
