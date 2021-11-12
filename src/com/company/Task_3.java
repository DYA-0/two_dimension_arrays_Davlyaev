package com.company;

import java.util.Scanner;
import static com.company.Tools.*;

public class Task_3 {

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
        Some_values result = search_min_value(two_dimensional_array);
        System.out.println("Минимальное значение массива равно: " + result.getFirst()
        + "\nИндекс элемента: [" + result.getSecond() + "][" + result.getThird() + "]" );

    }
    public static Some_values<Integer, Integer, Integer> search_min_value (int [][] arr) {
        int min = arr [0][0];
        int min_index_row = 0;
        int min_index_column = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr [i][j]){
                    min = arr [i][j];
                    min_index_row = i;
                    min_index_column = j;
                }
            }
        }
        return new Some_values(min, min_index_row, min_index_column );
    }
}
