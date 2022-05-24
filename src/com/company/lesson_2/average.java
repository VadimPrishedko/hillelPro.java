package com.company.lesson_2;

import com.company.utils.scannerNamber;

public class average {
    public static void average() {
        System.out.println("Enter the number of digits from which you need the arithmetic mean ");
        int amount = scannerNamber.getNamber();
        int sum = 0;
        for (int i = 0; i < amount; i++) {
            int temp = scannerNamber.getNamber();
            sum += temp;
        }

        double result = sum / amount;
        System.out.println("Average " + result);

    }
}
