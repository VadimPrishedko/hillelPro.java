package com.company.Lesson_5;

import java.util.Random;

public class StudentGenerator {
    public static Student[] students = new Student[10];

    public static void getStudentLists() {


        final String[] NAMES = {"Pirate", "Bolivar", "Cristo", "Mike",
                "Jack", "Tonny", "Lucie", "Greene", "Luke", "Nick"};

        final String[] SURNAME = {"Kalmanovich", "Kalvarysky", "Kamenechny", "Kamenetsky",
                "Kaminar", "Kaminsky", "Kanter", "Kantor", "Kantorovich", "Peysakhovich"};

        Random random = new Random();

        for (int i = 0; i < students.length; i++) {
            int yearBirth = random.nextInt(2000, 2006);
            String telephone = String.valueOf(random.nextInt(111111111, 999999999));
            int faculty = random.nextInt(1, 6);
            int course = random.nextInt(1, 5);
            int group = random.nextInt(100, 103);
            students[i] = new Student(i, SURNAME[i], NAMES[i], SURNAME[i], yearBirth, NAMES[i], telephone, faculty, course, group);

            System.out.println(students[i]);
        }


    }


}
