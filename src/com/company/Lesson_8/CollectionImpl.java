package com.company.Lesson_8;

public class CollectionImpl implements Collection {

    public static String[] array = new String[10];
    private int count = 0;


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
        return null;
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
        boolean temp = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == str[i]){
                temp = true;
            } else {
                temp = false;
            }
        }
        return temp;
    }

    @Override
    public boolean clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        count = 0;
        return true;
    }

    @Override
    public int size() {
        return count;
    }
}
