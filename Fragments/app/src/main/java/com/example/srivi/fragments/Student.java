package com.example.srivi.fragments;

/**
 * Created by srivi on 22-03-2018.
 */

public class Student {
    String name;
    String email;
    String department;
    int mood;

    public Student(String name, String email, String department, int mood) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.mood = mood;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", mood=" + mood +
                '}';
    }
}
