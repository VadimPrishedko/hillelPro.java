package com.company.Lesson_9;


public class Run {

    public static void main(String[] args) {


        CustomCollectionImpl<String> collect = new CustomCollectionImpl<>();
        CustomCollectionImpl<String> collect2 = new CustomCollectionImpl<>();

        collect.add("test");
        collect.add("test1");
        collect.add("test2");
        collect.add("test3");
        System.out.println(collect.get(2));
        System.out.println(collect.delete("test2"));
        System.out.println(collect.get(2));
        System.out.println(collect.size());
        System.out.println(collect.contains("test2"));
        System.out.println(collect2.add("test4"));
        System.out.println(collect2.add("test5"));
        System.out.println(collect2.add("test6"));
        collect.clear();

    }


}
