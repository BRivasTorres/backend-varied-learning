package com.libraryManagementSystem;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        final String[] options = { "Login", "New User" };

        JOptionPane.showMessageDialog(null, "Welcome to Library Management System", "Welcome!!",
                JOptionPane.INFORMATION_MESSAGE);
        int result = JOptionPane.showOptionDialog(null, "Enther", "Enter", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        switch (result) {
            case 1:
                login();
            case 2:
                newuser();
            default:
                JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void login() {
        JOptionPane.showMessageDialog(null, "Enther phone number", "Phone number", 0);
    }

    private static void newuser() {
        final String[] roles = { "Admin, Normal User" };

        String name = JOptionPane.showInputDialog("Enther Name: ");
        String email = JOptionPane.showInputDialog("Enther email: ");
        String phoneNumber = JOptionPane.showInputDialog("Enther Phone Number: ");
        int resultRoles = JOptionPane.showOptionDialog(null, "Roles", "Roles", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, roles, roles[0]);

        if (resultRoles == 0) {
            User adming = new User(name, email, phoneNumber);
        } else {
            User user = new User(name, email, phoneNumber);
        }
    }

}