package com.company.utils;

import java.util.Scanner;

public class scannerNamber {


    public static int getNamber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int namber = scanner.nextInt();
        return namber;
    }

}
