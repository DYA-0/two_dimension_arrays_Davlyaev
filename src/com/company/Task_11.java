package com.company;

import java.util.Scanner;
import static com.company.Tools.*;

public class Task_11 {

    public static void main(String[] args) {

        System.out.println("Введите размер двумерного массива: ");
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        System.out.println("Введите диапазон значений рандомайзера: ");
        double start = in.nextDouble();
        double end = in.nextDouble();
        double[][] two_dimensional_array = new double[rows][columns];
        fill_2_dim_array_random_numbers_double(two_dimensional_array, start, end);
        /*Одновременно максимальный и минимальный элемент можно переставить при условии, что
        данные элементы не находятся в одной строке и столбце одновременно.
        Для проверки, использовать приведенный ниже масиив, закомментив строки 10-19*/
//        double[][] two_dimensional_array = new double[][]{
//                {2.0, 0.0, 3.5, 1.3, 1.0},
//                {4.0, 3.3, 9.0, 7.3, 8.4},
//                {9.0, 4.3, 4.5, 6.4, 8.0},
//                {5.0, 4.1, 9.2, 4.1, 3.0},
//                {7.0, 3.5, 3.5, 1.5, 2.0}};
        System.out.println("Текущий двумерной массив: ");
        print_2_dim_array_double(two_dimensional_array);
        switch_rows_and_columns_max_element(two_dimensional_array);
        System.out.println("Массив с перестановкой строк / столбцов, максимальный элемент в верхнем левом углу:");
        print_2_dim_array_double(two_dimensional_array);
        switch_rows_and_columns_min_element(two_dimensional_array);
        System.out.println("Массив с перестановкой строк / столбцов, минимальный элемент в нижнем правом углу:");
        print_2_dim_array_double(two_dimensional_array);

    }

    public static void switch_rows_and_columns_max_element (double[][] arr) {
        double max = arr[0][0];
        int max_row = 0;
        int max_column = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    max_row = i;
                    max_column = j;
                }
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            double temp = arr[0][j];
            arr[0][j] = arr[max_row][j];
            arr[max_row][j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            double temp = arr[i][0];
            arr[i][0] = arr[i][max_column];
            arr[i][max_column] = temp;
        }
    }
    public static void switch_rows_and_columns_min_element(double[][] arr){

        double min = arr[0][0];
        int min_row = 0;
        int min_column = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] < min){
                    min = arr[i][j];
                    min_row = i;
                    min_column = j;
                }
            }
        }
        for (int j = 0; j < arr[0].length; j++){
            double temp = arr[arr.length-1][j];
            arr[arr.length-1][j] = arr[min_row][j];
            arr[min_row][j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            double temp = arr[i][arr[0].length-1];
            arr[i][arr[0].length-1] = arr[i][min_column];
            arr[i][min_column] = temp;
        }
    }
}
