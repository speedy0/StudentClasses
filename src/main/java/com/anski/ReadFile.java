package com.anski;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadFile {
    public static ArrayList<Student> populateStudentArray(String path){
        ArrayList<Student> students = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()){
                String[] record = line.split(",");
                Student student = new Student(record[0], Integer.parseInt(record[1]), Integer.parseInt(record[2]));
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

            return students;
    }
}
