package com.company.Lesson_7;



public class ArrayServiceImpl implements ArrayService {
    public static String[] array = new String[10];

    private int count = 0;


    @Override
    public boolean add(int index, String value) {
        if (index > count - 1) {
            array[index] = value;
            count++;
            return true;
        } else {
            System.out.println("Позиція занята");
        }
        return false;

    }


    @Override
    public boolean add(String value) {
        for (int i = 0; i < array.length; i++) {
            if (i == count) {
                count++;
                array[i] = value;
                System.out.println("позиція " + i + " значення " + value);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int index) {
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                array[i] = null;
                count--;
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean delete(String value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                array[i] = null;
                count--;
            }
        }
        return false;
    }

    @Override
    public String get(int index) {
        return array[index];
    }


}
