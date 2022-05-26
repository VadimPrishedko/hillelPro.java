package com.company.lesson_3;

public class chessBoard {
    public static void chessBoard() {
        String str = "";
        String w = " W ";
        String b = " B ";

        for (int i = 1; i < 65; i++) {
            str += i % 2 == 1 ? w : b;
            if (i % 8 == 0){
                str += "\n";
                String temp = w;
                w = b;
                b = temp;
            }


        }

        System.out.println(str);

    }
}
