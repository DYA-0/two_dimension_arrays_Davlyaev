package com.company;

import java.util.Scanner;
import static com.company.Tools.*;

public class Task_12 {

    public static void main(String[] args) {

        System.out.println("Введите размер двумерного массива: ");
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        int[][] arr = new int[rows][columns];
        int count = 1;
        int row = 0;
        int column = 0;
        while (count <= rows * columns){
            for (int j = 0; j < arr[row].length; j++) right: {
                if (arr[row][j] == 0){
                    arr[row][j] = count;
                    count++;
                }
            }

            for (int i = 0; i < arr.length; i++) down: {
                if (arr[i][arr[row].length - 1 - column] == 0) {
                    arr[i][arr[row].length - 1 - column] = count;
                    count++;
                }
            }

            for (int j = columns - 1; j >= 0; j--) left: {
                if (arr[arr.length - 1 - row][j] == 0){
                    arr[arr.length - 1 - row][j] = count;
                    count++;
                }
            }

            for (int i = rows - 1; i >= 0; i--) up: {
                if (arr[i][column] == 0) {
                    arr[i][column] = count;
                    count++;
                }
            }
            row++;
            column++;
        }
        System.out.println("Массив улитка:");
        print_2_dim_array(arr);
    }
}
