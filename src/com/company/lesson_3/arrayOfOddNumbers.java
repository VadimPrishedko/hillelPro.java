package com.company.lesson_3;

public class arrayOfOddNumbers {
    public static void arrayOfOddNumbers() {

        int[] myArray = new int[10];
        String str = "";
        int temp = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 1) {
                myArray[temp] = i;
                temp++;
                str +=  i + ", ";
            }
        }
        System.out.println(str);


    }
}
