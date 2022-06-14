package com.company.Lesson_7;


import static com.company.Lesson_7.Array.array;

public class ArrayServiceImpl implements ArrayService {

    private int count = 0;


    @Override
    public boolean add(int index, String value) {
        if (array[index] == null) {
            array[index] = value;
            System.out.println(array[index]);
            return true;
        }
        System.out.println("Позиція занята");
        return false;

    }


    @Override
    public boolean add(String value) {
        System.out.println(count);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null && array.length > count) {
                array[i] = value;
                count++;
                return true;
            } else {
                System.out.println("позиція " + i + " значення " + value);
            }
        }
        return false;
    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public boolean delete(String value) {
        return false;
    }

    @Override
    public String get(int index) {
        return array[index];
    }


}
