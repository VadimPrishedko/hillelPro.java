package com.company.lesson_3;

import com.company.utils.scannerNamber;

public class degree {
    public static void degree() {
        int namber = scannerNamber.getNamber();
        int degree = scannerNamber.getNamber();
        int result = namber;


        for (int i = 1; i < degree; i++) {

            result *= namber;
        }
        System.out.println(result);
    }
}
