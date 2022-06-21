package com.company.Lesson_9;


public class Run {

    public static void main(String[] args) {


        CustomCollectionImpl<String> collect = new CustomCollectionImpl<>();
        CustomCollectionImpl<String> collect2 = new CustomCollectionImpl<>();


        collect.add("test");
        collect.add("test1");
        collect.add("test2");
        collect2.add("test3");
        collect2.add("test4");
        collect2.add("test5");
        collect2.add("test6");
        System.out.println(collect.get(2));

        collect.delete("test7");
        System.out.println(collect.contains("test8"));
        collect.addAll(collect2);
        System.out.println(collect.size());

        collect.clear();


    }


}
