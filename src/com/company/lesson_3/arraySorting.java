package com.company.lesson_3;

public class arraySorting {
    public static void arraySorting() {
        int[] myArray = new int[]{4, -5, 0, 6, 8};
        int tempMin = 0;
        int tempMax = 0;
        int posMin = 0;
        int posMax = 0;
        String str = "";
        for (int i = 0; i < myArray.length; i++) {

            if (tempMin < myArray[i]) {
                tempMin = myArray[i];
                posMin = i;
            }
            if (tempMax > myArray[i]) {
                tempMax = myArray[i];
                posMax = i;
            }
        }
        myArray[posMin] = tempMax;
        myArray[posMax] = tempMin;

        for (int i = 0; i < myArray.length; i++) {
            str += myArray[i] + ", ";
        }

        System.out.println(str);
    }
}

