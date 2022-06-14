package com.company.Lesson_7;


import static com.company.Lesson_7.Array.array;

public class Run {
    public static void main(String[] args) {
        ArrayServiceImpl serviceArray = new ArrayServiceImpl();

//        new ArrayServiceImpl().add(4, "r");
//        new ArrayServiceImpl().add(4, "r");

        for (int i = 0; i < 12; i++){
            serviceArray.add("fff");
            serviceArray.add(null);
        }

        serviceArray.add(4,"rrrr");

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
//
//        serviceArray.add(null);
//
//        serviceArray.add("fff");
//
//        serviceArray.add("fff");

//        System.out.println(new ArrayServiceImpl().get(4));

    }

}
