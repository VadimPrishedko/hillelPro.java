package com.company.lesson_2;

import com.company.utils.scannerNamber;

public class arithmeticMeanTwoNum {
    public static void calculation() {
        System.out.println("Calculate the arithmetic mean of two numbers ");
        int a = scannerNamber.getNamber();
        int b = scannerNamber.getNamber();

        double c = (a + b) / 2;
        System.out.println("Arithmetic mean of two numbers " + c);
    }
}
