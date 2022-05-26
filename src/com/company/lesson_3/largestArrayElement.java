package com.company.lesson_3;

public class largestArrayElement {
    public static void largestArrayElement() {
        int[] myArray = new int[10];
        int temp = 0;

        for (int i = 0; i < 10; i++) {
            myArray[i] = i + 1;
            if (i > myArray[i]) {
                temp = myArray[i];
            }
        }
        System.out.println(temp);
    }


}
