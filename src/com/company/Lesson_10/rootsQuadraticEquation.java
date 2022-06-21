package com.company.Lesson_10;

public class rootsQuadraticEquation {


    double a , b, c;

    public rootsQuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        rootsQuadraticEquation(a, b, c);
    }

    public static void rootsQuadraticEquation(double a, double b, double c) {
        double d = b * b - 4 * a * c;

        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней");
        }
    }
}
