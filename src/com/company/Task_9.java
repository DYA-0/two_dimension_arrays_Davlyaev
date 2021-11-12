package com.company;

import java.util.Scanner;
import static com.company.Tools.*;

public class Task_9 {

    public static void main(String[] args) {

//        System.out.println("Введите размер двумерного массива: ");
//        Scanner in = new Scanner(System.in);
//        int rows = in.nextInt();
//        int columns = in.nextInt();
//        System.out.println("Введите диапазон значений рандомайзера: ");
//        double start = in.nextDouble();
//        double end = in.nextDouble();
//        double[][] two_dimensional_array = new double[rows][columns];
//        fill_2_dim_array_random_numbers_double(two_dimensional_array, start, end);
        double[][] two_dimensional_array = new double[][]{
                {7.0, 0.0, 3.5, 1.3, 0.0},
                {4.0, 3.3, 9.0, 7.3, 8.4},
                {9.0, 4.3, 4.5, 6.4, 8.0},
                {0.0, 4.1, 9.2, 4.1, 0.0},
                {7.0, 3.5, 3.5, 1.5, 0.0}};
        System.out.println("Текущий двумерной массив: ");
        print_2_dim_array_double(two_dimensional_array);
        String saddle_points = saddlePoint(two_dimensional_array);
        System.out.println("Седловые точки: \n" + saddle_points );

    }

    public static String saddlePoint (double[][] arr){
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int count = 0;
                for (int row = 0; row < arr.length; row++) {
                    if (arr[i][j] > arr[row][j]) {
                        count++;
                    }
                }
                for (int column = 0; column < arr[i].length; column++) {
                    if (arr[i][j] < arr[i][column]) {
                        count++;
                    }
                }
                if (count == arr.length + arr[0].length - 2){
                    result += arr[i][j] + " с индексами [" + i + "][" + j + "]; Строка: "
                    + (i + 1) + "; Столбец: " + (j + 1);
                }
            }
        }
        return result;
    }
}

