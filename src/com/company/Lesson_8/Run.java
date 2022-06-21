package com.company.Lesson_8;


import static com.company.Lesson_8.CollectionImpl.array;

public class Run {
    public static void main(String[] args) {

        Collection servise = new CollectionImpl<String>();

        servise.add("test");
        servise.add( 1,"test2");
        servise.add(null);
        servise.add( 2,"test3");
        servise.delete("test3");
        System.out.println(servise.get(0));
        System.out.println(servise.contain("test"));
        System.out.println(servise.equals(array));
        System.out.println(servise.size());
        System.out.println(servise.clear());




    }
}
