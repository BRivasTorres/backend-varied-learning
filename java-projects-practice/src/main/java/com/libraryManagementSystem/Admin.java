package com.libraryManagementSystem;

import javax.swing.JOptionPane;

public class Admin extends User {

    public Admin(String name) {
        super(name);
        this.operations = new IOOperation[] {
                new ViewBooks(),
                new AddBook(),
                new DeleteBook(),
                new Search(),
                new DeleteAllData(),
                new ViewOrders(),
                new Exit()
        };
    }

    public Admin(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
        this.operations = new IOOperation[] {
                new ViewBooks(),
                new AddBook(),
                new DeleteBook(),
                new Search(),
                new DeleteAllData(),
                new ViewOrders(),
                new Exit()
        };
    }

    @Override
    public void menu() {
        String[] adminOptions = { "View Books", "Add Book", "Delete Book", "Serch", "Delete all data", "View Orders",
                "Exit" };

        int n = JOptionPane.showOptionDialog(null, "Select an option", "Options", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, adminOptions, adminOptions[0]);
        this.operations[n].oper();
    }
}