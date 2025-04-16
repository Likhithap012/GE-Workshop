package com.gevernova.workshoptwo;

import java.util.Scanner;

public class Main {
    static Student[] students;

        public static void main(String[]args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter total number of students: ");
            int totalStudents = sc.nextInt();

            students = new Student[totalStudents];

            for (int i = 0; i < totalStudents; i++) {
                System.out.println("\nEnter details for student " + (i + 1) + ":");
                students[i] = Student.createStudent(sc);
            }

            System.out.println("\nAll Students:");
            for (Student student : students) {
                System.out.println(student); // toString() will be called automatically
            }



        }
}
