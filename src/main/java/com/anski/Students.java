package com.anski;

import java.util.ArrayList;

public class Students {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void addStudents(ArrayList<Student> students){
        for (Student student : students){
            addStudent(student);
        }
    }

    public void printStudents(){
        int currStudent = 1;
        for (Student student : this.students){
            System.out.println("Student " + currStudent + ": " + student.toString());
            currStudent += 1;
        }
    }

    public void getStudent(int age){
        boolean studentFound = false;
        for (Student student: this.students){
            if (student.getAge() == age){
                System.out.println("Student: " + student.toString());
                studentFound = true;
            }
        }

        if (!studentFound){
            System.out.println("No students were found with provided age.");
        }
    }

    public void getStudent(String name){
        boolean studentFound = false;
        for (Student student: this.students){
            if (student.getName().equals(name)){
                System.out.println("Student: " + student.toString());
                studentFound = true;
            }
        }

        if (!studentFound){
            System.out.println("No students were found with provided name.");
        }
    }
}
