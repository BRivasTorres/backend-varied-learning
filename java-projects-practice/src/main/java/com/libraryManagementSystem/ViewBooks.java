package com.libraryManagementSystem;

import javax.swing.JOptionPane;

public class ViewBooks implements IOOperation {

    @Override
    public void oper() {
        JOptionPane.showMessageDialog(null, "view books", "view", JOptionPane.INFORMATION_MESSAGE);
    }

}
