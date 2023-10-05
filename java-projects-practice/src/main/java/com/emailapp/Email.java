package com.emailapp;

import javax.swing.JOptionPane;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        JOptionPane.showMessageDialog(null, this.firstName + " " + this.lastName, "Email Created :",
                JOptionPane.INFORMATION_MESSAGE);
        this.department = setDepartment();
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

}
