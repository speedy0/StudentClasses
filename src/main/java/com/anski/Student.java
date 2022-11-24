package com.anski;

public class Student {
    // Three private variables stored by Student object.
    String name;
    int age;
    int id;

    // Constructor creating a student.
    public Student(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Returns student name
    public String getName() {
        return name;
    }

    // Returns student age
    public int getAge() {
        return age;
    }

    // Returns student ID
    public int getId() {
        return id;
    }

    // Prints student's name, age and ID
    @Override
    public String toString() {
        return "Name:'" + name + '\'' +
                ", Age:" + age +
                ", Id:" + id +
                '.';
    }
}
