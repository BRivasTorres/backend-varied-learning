package com.libraryManagementSystem;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        final String[] options = { "Login", "New User" };

        JOptionPane.showMessageDialog(null, "Welcome to Library Management System", "Welcome!!",
                JOptionPane.INFORMATION_MESSAGE);
        int result = JOptionPane.showOptionDialog(null, "Enther", "Enter", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, args, args[0]);
    }
}

// int result = JOptionPane.showOptionDialog(null, "Enter the department",
// "Enter the department",
// JOptionPane.YES_NO_CANCEL_OPTION,
// JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);