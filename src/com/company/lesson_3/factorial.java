package com.company.lesson_3;

import com.company.utils.scannerNamber;


public class factorial {
    public static void factorial() {
        int namber = scannerNamber.getNamber();
        int temp = 1;
        for (int i = 1; i < namber + 1; i++) {
            temp *= i;
        }
        System.out.println(temp);
    }


}
