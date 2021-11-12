package com.company;

import java.util.Scanner;
import static com.company.Tools.*;

public class Task_1 {

    public static void main(String[] args) {

        System.out.println("Введите размер двумерного массива: ");
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        System.out.println("Введите диапазон значений рандомайзера: ");
        int start = in.nextInt();
        int end = in.nextInt();
        int[][] two_dimensional_array = new int[rows][columns];
        fill_2_dim_array_random_numbers(two_dimensional_array, start, end);
        print_2_dim_array(two_dimensional_array);
        System.out.println();
        int min_value = search_min_value(two_dimensional_array);
        System.out.println("Минимальное значение массива равно: " + min_value);

    }
    public static int search_min_value (int [][] arr) {
        int min = arr [0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr [i][j]){
                    min = arr [i][j];
                }
            }
        }
        return min;
    }
}
