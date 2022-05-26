package com.company.lesson_3;

import com.company.utils.scannerNamber;

public class sequenceOfNumbers {
    public static void sequenceOfNumbers() {
        int step = scannerNamber.getNamber();
        String str = "";
        int temp = 0;
        for (int i = 0; i < 10; i++) {
            str += temp;
            temp -= step;
        }

        System.out.println(str);
    }
}
