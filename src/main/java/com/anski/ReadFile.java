package com.anski;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadFile {
    public static ArrayList<Student> populateStudentArray(String path){
        //Creates an empty list that will be populated through the file
        ArrayList<Student> students = new ArrayList<>();

        try {
            // Creates file reader and buffered reader to go through the csv file.
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // Skips first line which contains ('name','age','id')
            bufferedReader.readLine();
            // Goes through all of the lines as long as there is a line and splits them using ','
            // It then creates student object and adds it to the list,
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
