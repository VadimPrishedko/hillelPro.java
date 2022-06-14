package com.company.Lesson_7;


import static com.company.Lesson_7.ArrayServiceImpl.array;

public class Run {
    public static void main(String[] args) {
        ArrayServiceImpl serviceArray = new ArrayServiceImpl();

        serviceArray.add("test");
        serviceArray.add( 1,"test2");
        serviceArray.add( "test3");
        serviceArray.delete("test3");
        serviceArray.delete(1);
        System.out.println(serviceArray.get(0));


    }

}
