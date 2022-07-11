package com.company.Lesson_8;

import com.company.Lesson_10.Iterator;

import java.util.Objects;

public class CollectionImpl<E> implements Collection, Iterator {

    public static String[] array = new String[10];
    private int count = 0;
    private int index = 0;


    @Override
    public boolean add(String o) {
        for (int i = 0; i < array.length; i++) {
            if (i == count) {
                count++;
                array[i] = o;
                System.out.println("позиція " + i + " значення " + o);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(int index, String o) {
        if (index > count - 1) {
            array[index] = o;
            count++;
            return true;
        } else {
            System.out.println("Позиція занята");
        }
        return false;
    }

    @Override
    public boolean delete(String o) {
        for (int i = 0; i < array.length; i++) {
            if (o == array[i]) {
                array[i] = null;
                count--;
            }
        }
        return false;
    }

    @Override
    public String get(int index) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                return array[i];
            }
        }
        return "Ячейка не заповнена";
    }

    @Override
    public boolean contain(String o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(String[] str) {
        for (int i = 0; i < array.length; i++) {
            if (!Objects.equals(array[i], str[i])) {
                return false;
            }

        }

        return true;
    }

    @Override
    public boolean clear() {
        array = new String[10];
        count = 0;
        return true;
    }

    @Override
    public int size() {
        return count;
    }


    @Override
    public boolean hasNext() {
        if (array[index] != null)
            return true;
        return false;
    }

    @Override
    public String next() {

        return array[index++];
    }

    @Override
    public boolean remove() {
        final String[] newArray = new String[array.length - 1];
        int temp = index + 1;

        System.arraycopy(array, 0, newArray, 0, temp);
        System.arraycopy(array, temp + 1, newArray, temp, newArray.length - temp);

        array = newArray;
        return true;
    }


}



