package com.anski;

import java.util.ArrayList;

public class App
{
    public static void main( String[] args )
    {
        // Instantiates students object that holds the list of all students.
        Students students = new Students();

        // Instantiates two students and adds them to students list.
        Student student = new Student("Valentin Franklin", 39, 8983);
        Student student2 = new Student("Kendal Goodwin", 45, 8353);
        students.addStudent(student);
        students.addStudent(student2);

        // Creates studentsList from a csv file and fills it into students list.
        ArrayList<Student> studentsList = ReadFile.populateStudentArray("src/main/resources/students.csv");
        students.addStudents(studentsList);

        // Prints all students
        students.printStudents();
        // Prints students with age 39
        students.getStudent(39);
        // Prints students with name: Kendal
        students.getStudent("Kendal Goodwin");
        // When passing student with wrong name, it should return "No student found with provided name"
        students.getStudent("JohnyS");
    }
}
