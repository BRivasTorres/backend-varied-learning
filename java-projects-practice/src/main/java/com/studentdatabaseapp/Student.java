package com.studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophmore\n3 - Senior\nEnter student class level:  ");
        this.gradeYear = in.nextInt();

        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

    }

    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }
}
