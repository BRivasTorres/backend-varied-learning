package com.emailapp;

import javax.swing.JOptionPane;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String department;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        JOptionPane.showMessageDialog(null, this.firstName + " " + this.lastName, "Email Created :",
                JOptionPane.INFORMATION_MESSAGE);
        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordLength);
        System.out.println(this.password);

        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + ".com";
        System.out.println("Your email is: " + this.email);
    }

    private String setDepartment() {
        String[] options = { "Sales", "Development", "Accounting", "None" };

        int result = JOptionPane.showOptionDialog(null, "Enter the department", "Enter the department",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        String selectedDepartment = options[result];
        JOptionPane.showMessageDialog(null, options[result], "Your department is : ",
                JOptionPane.INFORMATION_MESSAGE);
        return selectedDepartment;
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void SetMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }
}
