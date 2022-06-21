package com.company.Lesson_10;


import com.company.Lesson_8.Collection;
import com.company.Lesson_8.CollectionImpl;
import com.company.utils.scannerNamber;

import java.util.LinkedList;
import java.util.List;


public class Run {
    public static void main(String[] args) {

/**
 * 1. Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
 */

        List list = new LinkedList();
        list.add("test");
        list.add("test2");
        list.add("test3");
        list.add("test");


        System.out.println(RemoveDuplicates.removeDuplicates(list));

        /**
         * 2. Написать итератор по коллекции реализованной в ДЗ №8 - надо заимплементить интерфейс Iterator
         */

        Collection servise = new CollectionImpl<>();

        servise.add("test");
        servise.add("test2");
        servise.add("test3");
        servise.add("test");

        Iterator<String> iterator = new CollectionImpl<>();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(iterator.remove());


        /**
         * 3. написать программу для вычисления корней квадратного уравнения
         */

        double a = scannerNamber.getNamber();
        double b = scannerNamber.getNamber();
        double c = scannerNamber.getNamber();
        new rootsQuadraticEquation(a, b, c);
    }




}
