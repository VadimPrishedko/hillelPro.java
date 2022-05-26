package com.company.lesson_3;

import static com.company.lesson_3.arrayOfOddNumbers.*;
import static com.company.lesson_3.arraySorting.*;
import static com.company.lesson_3.chessBoard.*;
import static com.company.lesson_3.degree.degree;
import static com.company.lesson_3.doWhileOddNumbers.*;
import static com.company.lesson_3.factorial.*;
import static com.company.lesson_3.forOddNumbers.*;
import static com.company.lesson_3.largestArrayElement.*;
import static com.company.lesson_3.multiplicationTable.*;
import static com.company.lesson_3.sequenceOfNumbers.*;
import static com.company.lesson_3.smallestArrayElement.*;
import static com.company.lesson_3.whileOddNumbers.*;

public class lesson3 {
    public static void lesson3() {
        System.out.println("1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.");
        forOddNumbers();
        System.out.println("2. Дано число n при помощи цикла for посчитать факториал n!");
        factorial();
        System.out.println("3. Перепишите программы (1 и 2) с использованием цикла while.");
        whileOddNumbers();
        System.out.println("4. Перепишите программы (1 и 2) с использованием цикла do - while.");
        doWhileOddNumbers();
        System.out.println("5. Даны переменные x и n вычислить x^n.");
        degree();
        System.out.println("6. Вывести 10 первых чисел последовательности 0, -5,-10,-15..");
        sequenceOfNumbers();
        System.out.println("7. Необходимо вывести на экран таблицу умножения на Х (х любое число в диапазоне 0 .. 10)");
        multiplicationTable();
        System.out.println("8. Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.");
        arrayOfOddNumbers();
        System.out.println("9. Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (массив заполнить случайными числами из диапазона 0 .. 100)");
        smallestArrayElement();
        System.out.println("10. В массиве из задания 9. найти наибольший элемент");
        largestArrayElement();
        System.out.println("11. Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.");
        arraySorting();
        System.out.println("12. Вывести на экран шахматную доску 8х8 в виде 2 мерного массива (W - белые клетки , B - черные клети)");
        chessBoard();
    }
}

