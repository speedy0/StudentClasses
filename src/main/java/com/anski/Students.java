package com.anski;

import java.util.ArrayList;

public class Students {
    ArrayList<Student> students = new ArrayList<>();

    // Takes student object as a parameter and adds it to the list.
    public void addStudent(Student student){
        students.add(student);
    }

    // Takes a list of students objects as a parameter and adds it to the list.
    public void addStudents(ArrayList<Student> students){
        for (Student student : students){
            addStudent(student);
        }
    }

    // Prints all students in order. Uses currStudent variable to number students (for visual display only)
    public void printStudents(){
        int currStudent = 1;
        for (Student student : this.students){
            System.out.println("Student " + currStudent + ": " + student.toString());
            currStudent += 1;
        }
    }

    // Gets student using the age.
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

    // Gets student using name.
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
