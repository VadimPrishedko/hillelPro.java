package com.company;

import com.company.Lesson_5.StudentGenerator;


public class Main {

    public static void main(String[] args) {
//        TripCalculation.calc(Integer.parseInt(args[0]));
        StudentGenerator.getStudentLists();
        StudentGenerator.year(2002);
        StudentGenerator.faculty(4);
        StudentGenerator.facultyAndCourse(4,4);
        StudentGenerator.group(102);
    }
}
