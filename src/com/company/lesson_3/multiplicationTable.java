package com.company.lesson_3;

import com.company.utils.scannerNamber;

public class multiplicationTable {
    public static void multiplicationTable() {
        String str = "";
        int namber = scannerNamber.getNamber();
        for (int i = 2; i < 11; i++) {
            str += namber + " * " + i + " = " + namber*i + "\n";
        }

        System.out.println(str);

    }
}
