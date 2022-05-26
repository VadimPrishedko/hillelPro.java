package com.company.lesson_3;


import com.company.utils.scannerNamber;

public class whileOddNumbers extends factorial {
    public static void whileOddNumbers() {
        odd();
        factorialWhile();
    }

    private static void odd() {
        String str = "";
        int namber = 100;
        int count = 0;

        while (namber > count) {
            str += (count % 2 == 1) ? count + ". " : "";
            count++;
        }
        System.out.println(str);
    }

    private static void factorialWhile() {
        int namber = scannerNamber.getNamber();
        int temp = 1;
        int count = 1;
        while (namber > count-1) {
            temp *= count;
            count++;
        }

        System.out.println(temp);
    }

}
