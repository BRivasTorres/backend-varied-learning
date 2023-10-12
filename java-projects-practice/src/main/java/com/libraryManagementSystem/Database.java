package com.libraryManagementSystem;

import java.util.ArrayList;

public class Database {
    ArrayList<User> users = new ArrayList<User>();
    ArrayList<String> usernames = new ArrayList<String>();

    public void AddUser(User s) {
        users.add(s);
        usernames.add(s.getName());

    }
}
