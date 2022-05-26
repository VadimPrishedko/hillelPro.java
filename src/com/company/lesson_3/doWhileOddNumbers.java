package com.company.lesson_3;

import com.company.utils.scannerNamber;

public class doWhileOddNumbers {
    public static void doWhileOddNumbers() {

        odd();
        factorialWhile();
    }

    private static void odd() {
        String str = "";
        int namber = 100;
        int count = 0;

        do {
            str += (count % 2 == 1) ? count + ". " : "";
            count++;
        }
        while (namber > count);
        System.out.println(str);
    }

    private static void factorialWhile() {
        int namber = scannerNamber.getNamber();
        int temp = 1;
        int count = 1;
        do {

            temp *= count;
            count++;
        }
        while (namber > count-1);

        System.out.println(temp);
    }
}
