package com.company.Lesson_5;

import static com.company.Lesson_5.StudentGenerator.students;

public class StudentService {
    /**
     * список студентів заданого факультету
     * факультетів 6 (від 1 до 6)
     */
    public static void faculty(int faculty) {
        System.out.println("список студентів заданого факультету; - " + faculty);
        for (Student student : students) {
            if (student.getFaculty() == faculty) {
                System.out.println(student.toString());
            }
        }
    }


    /**
     * список студентів заданого факультету та курсу
     * факультетів 6 (від 1 до 6)
     * курсів 5 (від 1 до 5)
     */
    public static void facultyAndCourse(int faculty, int course) {
        System.out.println("список студентів заданого факультету та курсу; - " + "факультет" + faculty + "курс" + course);
        for (Student student : students) {
            if (student.getFaculty() == faculty || student.getCourse() == course) {
                System.out.println(student.toString());
            }
        }
    }

    /**
     * список студентів, які народилися після заданого року
     * роки народження 2000 - 2006
     */

    public static void year(int YearBirth) {
        System.out.println("список студентів, які народилися після заданого року; - " + YearBirth);
        for (Student student : students) {
            if (student.getYearBirth() > YearBirth) {
                System.out.println(student.toString());
            }
        }
    }

    /**
     * список навчальної групи
     * групи 100 - 103
     */

    public static void group(int group) {
        System.out.println("список навчальної групи; - " + group);
        for (Student student : students) {
            if (student.getGroup() == group) {
                System.out.println(student.toString());
            }
        }
    }
}
