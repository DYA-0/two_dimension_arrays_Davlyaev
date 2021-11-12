package com.company;

import java.util.Scanner;
import static com.company.Tools.*;

public class Task_8 {

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
        System.out.println("Текущий двумерной массив: ");
        print_2_dim_array_double(two_dimensional_array);
        System.out.println("Массив сумм элементов строк: ");
        double[] sum_of_rows_elements = sum_of_rows_elements(two_dimensional_array, rows);
        print_1_dim_array_double(sum_of_rows_elements);
        System.out.println("Массив произведений элементов строк: ");
        double[] product_of_rows_elements = product_of_rows_elements(two_dimensional_array, rows);
        print_1_dim_array_double(product_of_rows_elements);
        System.out.println("Массив средних арифметических элементов строк: ");
        double[] arithmetic_mean_of_rows_elements = arithmetic_mean_of_rows_elements(two_dimensional_array, rows);
        print_1_dim_array_double(arithmetic_mean_of_rows_elements);
    }

    public static double[] sum_of_rows_elements(double[][] arr, int rows){
        double [] sum_elements = new double[rows];
        for (int row = 0; row < arr.length; row++){
            sum_elements[row] = 0;
            for (int column = 0; column < arr[row].length; column++){
                sum_elements[row] += arr[row][column];
            }
        }
        return sum_elements;
    }

    public static double[] product_of_rows_elements(double[][] arr, int rows){
        double [] product_elements = new double[rows];
        for (int row = 0; row < arr.length; row++){
            product_elements[row] = 1;
            for (int column = 0; column < arr[row].length; column++){
                product_elements[row] *= arr[row][column];
            }
        }
        return product_elements;
    }

    public static double[] arithmetic_mean_of_rows_elements(double[][] arr, int rows){
        double[] arith_mean_elements = new double[rows];
        for (int row = 0; row < arr.length; row++){
            arith_mean_elements[row] = 0;
            double sum_elements = 0;
            double count = 0;
            for (int column = 0; column < arr[row].length; column++) {
                sum_elements += arr[row][column];
                count++;
            }
            arith_mean_elements[row] = sum_elements / count;
        }
        return arith_mean_elements;
    }

}
