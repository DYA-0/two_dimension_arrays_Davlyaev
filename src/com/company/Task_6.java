package com.company;

import java.util.Scanner;
import static com.company.Tools.*;

public class Task_6 {

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
        matrix_transpose(two_dimensional_array);
        print_2_dim_array(two_dimensional_array);
    }

    public static void matrix_transpose(int[][] arr) {
        int i = 0;
        int j = 0;
        while (i < arr.length){
            while (j < arr[i].length){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
                j++;
            }
            j = i;
            j++;
            i++;
        }
    }
}

