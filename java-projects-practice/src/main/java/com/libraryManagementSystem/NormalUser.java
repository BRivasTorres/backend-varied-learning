package com.libraryManagementSystem;

import javax.swing.JOptionPane;

public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.operations = new IOOperation[] {
                new ViewBooks(),
                new Search(),
                new PlaceOrder(),
                new BorrowBook(),
                new CalculateFine(),
                new ReturnBook(),
                new Exit()
        };
    }

    public NormalUser(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
        this.operations = new IOOperation[] {
                new ViewBooks(),
                new Search(),
                new PlaceOrder(),
                new BorrowBook(),
                new CalculateFine(),
                new ReturnBook(),
                new Exit()
        };
    }

    @Override
    public void menu(Database database, User user) {
        String[] userOptions = { "View Books", "Search", "Place Order", "Borrow Bood", "Calculate Fine", "Return Book",
                "Exit" };

        int n = JOptionPane.showOptionDialog(null, "Select an option", "Options", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, userOptions, userOptions[0]);
        this.operations[n].oper(database, user);
        // ! s. close()
    }
}
