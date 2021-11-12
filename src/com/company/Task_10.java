package com.company;

import java.util.Scanner;
import static com.company.Tools.*;

public class Task_10 {

    public static void main(String[] args) {

        System.out.println("Для запонения массива [5][7] " +
                "введите диапазон значений рандомайзера: ");
        Scanner in = new Scanner(System.in);
        double start = in.nextDouble();
        double end = in.nextDouble();
        int rows = 5;
        int columns = 7;
        double[][] two_dimensional_array = new double[rows][columns];
        fill_2_dim_array_random_numbers_double(two_dimensional_array, start, end);
        System.out.println("Текущий двумерной массив: ");
        print_2_dim_array_double(two_dimensional_array);
        System.out.println("\nВведите число целое число К = I + J, где I и J - " +
                "номера строки и столбца соответственно:");
        int k_number = in.nextInt();
        String sum_result = sum_of_elements(two_dimensional_array, k_number, rows, columns);
        System.out.println(sum_result);
    }

    public static String sum_of_elements (double[][] arr, int k_number, int rows, int columns){
        double sum = 0;
        String result = "Сумма элементов, сумма индексов которых составляет " + k_number + ", равна: ";
        if (k_number <= rows + columns - 2 && k_number >= 0) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (k_number == i + j) {
                        sum += arr[i][j];
                        System.out.println(arr[i][j]);
                    }
                }
            }
            sum = Math.round(sum * 10.0) / 10.0;
            result += sum;
        }
        else{
            result = "Число К не позволяет найти решение:\n" +
                    "Сумма индексов не может быть меньше 0 и больше " + (rows + columns - 2);
        }
        return result;
    }
}
