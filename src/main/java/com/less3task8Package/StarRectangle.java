//Write a 8program which prints the next figure to the console:
//        **********
//        **********
//        **********
//        **********

package com.less3task8Package;

import java.util.Scanner;

public class StarRectangle {

    public static void paintStars(int lines, int column){
        for (int i = 1; i <= lines; i++ ){
            for (int j = 1; j <= column; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // вводим значения строк и столбцов
        System.out.print("Input a number of lines: ");
        String str1 = in.nextLine();
        System.out.print("Input a number of column: ");
        String str2 = in.nextLine();

        // проверяем введены ли цифры, если нет - программа прекращает работу
        try {
            Integer.parseInt(str1);
            Integer.parseInt(str2);

        } catch (Exception e) {
            System.out.println("One or both of entered values are not a digit or digits are too big");
            System.exit(0);
        }
        int line = Integer.parseInt(str1);
        int column = Integer.parseInt(str2);
        if (line < 1  || column < 1) {
            System.out.println("Entered values must be more then 0");
            System.exit(0);
        }

        paintStars(line, column);

    }
}
