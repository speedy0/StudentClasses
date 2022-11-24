package com.anski;

public class Student {
    String name;
    int age;
    int id;

    public Student(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Name:'" + name + '\'' +
                ", Age:" + age +
                ", Id:" + id +
                '.';
    }
}
