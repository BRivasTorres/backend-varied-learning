package com.libraryManagementSystem;

import javax.swing.JOptionPane;

public class Main {
    static Database database;

    public static void main(String[] args) {
        database = new Database();

        final String[] options = { "Exit", "Login", "New User" };

        int num;
        // do {
        JOptionPane.showMessageDialog(null, "Welcome to Library Management System", "Welcome!!",
                JOptionPane.INFORMATION_MESSAGE);
        int result = JOptionPane.showOptionDialog(null, "Enter", "Enter", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        num = result;
        switch (result) {
            case 1:
                login();
                break;
            case 2:
                newuser();
                break;
        }
        // } while (num != 0);
    }

    private static void login() {
        String email = JOptionPane.showInputDialog("Enther email: ");
        String phoneNumber = JOptionPane.showInputDialog("Enther Phone Number: ");

        int n = database.login(phoneNumber, email);
        if (n != -1) {
            User user = database.getUser(n);
            user.menu(database, user);
        } else {
            JOptionPane.showMessageDialog(null, "User doesnt exist", "User not found", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void newuser() {
        final String[] roles = { "Admin", "Normal User" };

        String name = JOptionPane.showInputDialog("Enther Name: ");
        String email = JOptionPane.showInputDialog("Enther email: ");
        String phoneNumber = JOptionPane.showInputDialog("Enther Phone Number: ");
        int resultRoles = JOptionPane.showOptionDialog(null, "Roles", "Roles", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, roles, roles[0]);

        User user;
        if (resultRoles == 0) {
            user = new Admin(name, email, phoneNumber);
        } else {
            user = new NormalUser(name, email, phoneNumber);
        }
        database.AddUser(user);
        user.menu(database, user);

        JOptionPane.showMessageDialog(null, "User Created Succesfully", "User created",
                JOptionPane.INFORMATION_MESSAGE);
    }
}