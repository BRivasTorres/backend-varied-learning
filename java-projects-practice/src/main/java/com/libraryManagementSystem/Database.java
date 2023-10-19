package com.libraryManagementSystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Database {

    private ArrayList<User> users = new ArrayList<User>();
    private ArrayList<String> usernames = new ArrayList<String>();
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<String> booknames = new ArrayList<String>();

    private File usersFile = new File(Main.class.getClassLoader().getResource("\\Users").getFile());
    private File booksFile = new File(Main.class.getClassLoader().getResource("\\Books").getFile());

    public Database() {
        if (!usersFile.exists()) {
            usersFile.mkdir();
        }
        if (!booksFile.exists()) {
            booksFile.mkdir();
        }
        getUsers();
    }

    public void AddUser(User s) {
        users.add(s);
        usernames.add(s.getName());
        saveUsers();
    }

    public int login(String phoneNumber, String email) {
        int n = -1;
        for (User s : users) {
            if (s.getPhoneNumber().matches(phoneNumber) && s.getEmail().matches(email)) {
                n = users.indexOf(s);
                break;
            }
        }
        return n;
    }

    public User getUser(int n) {
        return users.get(n);
    }

    public void AddBook(Book book) {
        books.add(book);
        booknames.add(book.getName());
        saveUsers();
    }

    private void getUsers() {
        String text1 = "";
        try {
            BufferedReader br1 = new BufferedReader(new FileReader(usersFile));
            String s1;
            while ((s1 = br1.readLine()) != null) {
                text1 = text1 + s1;
            }
            br1.close();
        } catch (Exception e) {
            System.err.println(e.toString());
        }

        if (!text1.matches("") || !text1.isEmpty()) {
            String[] a1 = text1.split("<NewUser/>");
            for (String s : a1) {
                String[] a2 = s.split("<N/>");
                if (a2[3].matches("Admin")) {
                    User user = new Admin(a2[0], a2[1], a2[2]);
                    users.add(user);
                    usernames.add(user.getName());
                } else {
                    User user = new NormalUser(a2[0], a2[1], a2[2]);
                    users.add(user);
                    usernames.add(user.getName());
                }
            }
        }
    }

    private void saveUsers() {
        String text1 = "";
        for (User user : users) {
            text1 = text1 + users.toString() + "<NewUser/>\n";
        }
        try {
            PrintWriter pw = new PrintWriter(usersFile);
            pw.println(text1);
            pw.close();
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
