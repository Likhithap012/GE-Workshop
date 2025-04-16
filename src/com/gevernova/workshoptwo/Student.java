package com.gevernova.workshoptwo;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    String name;
    int rollNumber;
    Course[] course;

    public Course[] getCourse() {
        return course;
    }

    public Student(Course[] course, String name, int rollNumber) {
        this.course = course;
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void setCourse(Course[] course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public static Student createStudent(Scanner sc) {
        System.out.print("Enter student name: ");
        String name = sc.next();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter number of courses: ");
        int courseCount = sc.nextInt();

        Course[] courses = new Course[courseCount];
        for (int i = 0; i < courseCount; i++) {
            System.out.print("Enter course code for course " + (i + 1) + ": ");
            String code = sc.next();

            System.out.print("Enter course name for course " + (i + 1) + ": ");
            String courseName = sc.next();

            courses[i] = new Course(code, courseName);
        }

        return new Student(courses, name, roll);
    }
    @Override
    public String toString() {
        return "com.gevernova.workshoptwo.Student{" +
                "course=" + Arrays.toString(course) +
                ", name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
