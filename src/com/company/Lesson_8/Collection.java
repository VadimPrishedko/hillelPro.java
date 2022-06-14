package com.company.Lesson_8;

public interface Collection {
    boolean add(String o);

    boolean add(int index, String o);

    boolean delete (String o);

    String get(int index);

    boolean contain(String o);

    boolean equals (String[] str);

    boolean clear();

    int size();
}
