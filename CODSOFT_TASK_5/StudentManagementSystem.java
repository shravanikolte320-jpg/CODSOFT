package com.game;

import java.util.ArrayList;
import java.util.Scanner;

class Student {

    int rollNo;
    String name;
    String grade;

    Student(int rollNo, String name, String grade) {

        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
    }

    void display() {

        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    students.add(new Student(roll, name, grade));

                    System.out.println("Student Added Successfully");
                    break;

                case 2:

                    if (students.isEmpty()) {

                        System.out.println("No Students Found");
                    }

                    else {

                        for (Student s : students) {

                            s.display();
                            System.out.println();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;

                    for (Student s : students) {

                        if (s.rollNo == searchRoll) {

                            s.display();
                            found = true;
                        }
                    }

                    if (!found) {

                        System.out.println("Student Not Found");
                    }

                    break;

                case 4:

                    System.out.print("Enter Roll Number to Remove: ");
                    int removeRoll = sc.nextInt();

                    boolean removed = students.removeIf(s -> s.rollNo == removeRoll);

                    if (removed) {

                        System.out.println("Student Removed Successfully");
                    }

                    else {

                        System.out.println("Student Not Found");
                    }

                    break;

                case 5:

                    System.out.println("Thank You");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}