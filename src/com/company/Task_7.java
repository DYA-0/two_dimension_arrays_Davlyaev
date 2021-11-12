package com.company;

import java.util.Scanner;
import static com.company.Tools.*;

public class Task_7 {

    public static void main(String[] args) {

        /*System.out.println("Введите размер двумерного массива: ");
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        System.out.println("Введите диапазон значений рандомайзера: ");
        int start = in.nextInt();
        int end = in.nextInt();
        double[][] two_dimensional_array = new double[rows][columns];
        fill_2_dim_array_random_numbers_double(two_dimensional_array, start, end);
        */
        double[][] two_dimensional_array = new double[][]{
        {7.0, 6.0, 3.5, 1.3, 0.0},
        {0.0, 1.3, 5.0, 1.3, 0.0},
        {1.0, 4.3, 1.5, 7.4, 0.0},
        {0.0, 4.1, 9.2, 4.1, 0.0},
        {7.0, 6.5, 3.5, 1.5, 0.0}};
        System.out.println("Текущий двумерной массив: ");
        print_2_dim_array_double(two_dimensional_array);
        boolean[] logic_vector_1 = zero_elements_in_column(two_dimensional_array);
        System.out.println("\nЛогический вектор, при условии нулевого столбца:");
        print_1_dim_array_boolean(logic_vector_1);
        boolean[] logic_vector_2 = sort_row_in_descending_order(two_dimensional_array);
        System.out.println("\nЛогический вектор, при условии упорядоченной по убыванию строки:");
        print_1_dim_array_boolean(logic_vector_2);
        boolean[] logic_vector_3 = symmetrical_row(two_dimensional_array);
        System.out.println("\nЛогический вектор, при условии симметричной строки:");
        print_1_dim_array_boolean(logic_vector_3);
    }

    public static boolean[] zero_elements_in_column (double[][] arr){
        boolean[] logic_vector = new boolean[arr.length];
        int column = 0;
        while (column < arr[0].length){
            int count = 0;
            for (int row = 0; row < arr.length; row++) {
                if (arr[row][column] == 0.0) {
                    count++;
                }
            }
            if (count == arr.length){
                logic_vector[column] = true;
            }
            else{
                logic_vector[column] = false;
            }
            column++;
        }
        return logic_vector;
    }

    public static boolean[] sort_row_in_descending_order(double[][] arr){
        boolean[] logic_vector = new boolean[arr[0].length];
        int count = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length - 1; column++){
                if (arr[row][column] < arr[row][column + 1]){
                    break;
                }
                else{
                    count++;
                }
            }
            if (count == arr[row].length - 1){
                logic_vector[row] = true;
            }
            else{
                logic_vector[row] = false;
            }
            count = 0;
        }
        return logic_vector;
    }

    public static boolean[] symmetrical_row(double[][] arr){
        boolean[] logic_vector = new boolean[arr[0].length];
        int count = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length - 2; column++) {
                if (arr[row][column] == arr[row][arr[row].length - 1 - column]){
                    count++;
                }
                else{
                    break;
                }
            }
            if (count == arr[row].length / 2 || count == arr[row].length / 2 + 1){
                logic_vector[row] = true;
            }
            else{
                logic_vector[row] = false;
            }
            count = 0;
        }
        return logic_vector;
    }
}
