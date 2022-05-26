package com.company.lesson_3;



public class forOddNumbers {
    public static void forOddNumbers() {
String str = "";
        for (int i = 0; i < 100; i++) {
            str += (i % 2 == 1)? i + ". ":"";
        }

        System.out.println(str);
    }

}
