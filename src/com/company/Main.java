package com.company;

import com.company.Lesson_4.TripCalculation;
import com.company.Lesson_5.StudentLists;


public class Main {

    public static void main(String[] args) {
//        TripCalculation.calc(Integer.parseInt(args[0]));
        StudentLists.getStudentLists();
        StudentLists.year(2002);
        StudentLists.faculty(4);
        StudentLists.facultyAndCourse(4,4);
        StudentLists.group(102);
    }
}
