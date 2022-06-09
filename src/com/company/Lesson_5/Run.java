package com.company.Lesson_5;

public class Run {
    public static void main(String[] args) {

        StudentGenerator.getStudentLists();
        StudentService.year(2002);
        StudentService.faculty(4);
        StudentService.facultyAndCourse(4, 4);
        StudentService.group(102);
    }
}
