package com.company.Lesson_9;

public interface CustomCollection<E>{
    boolean add(String str);

    boolean addAll(CustomCollection strColl);

    boolean delete (int index);

    boolean delete (String str);

    String get(int index);

    boolean contains(String str);

    boolean clear();

    int size();

    boolean trim();
}
