package com.company;

import java.util.Scanner;
import static com.company.Tools.*;

public class Task_5 {

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
        int local_max_counter = search_max_elements_among_neighbors(two_dimensional_array);
        System.out.println("Количество элементов, которые больше своих соседей, составляет: " + local_max_counter);

    }

    public static int search_max_elements_among_neighbors(int[][] arr) {
        int count_local_max = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                int some_count = 0;
                if (i - 1 < 0){
                    some_count += 1;
                }
                if (j - 1 < 0){
                    some_count += 2;
                }
                if (i + 1 > arr[i].length - 1){
                    some_count += 4;
                }
                if (j + 1 > arr.length - 1){
                    some_count += 8;
                }

                switch (some_count){
                    case 1:
                        if (arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j + 1]) {
                            count_local_max++;
                            continue;
                        }
                        else{
                            continue;
                        }
                    case 2:
                        if (arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i - 1][j]) {
                            count_local_max++;
                            continue;
                        }
                        else{
                            continue;
                        }
                    case 4:
                        if (arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i][j + 1]) {
                            count_local_max++;
                            continue;
                        }
                        else{
                            continue;
                        }
                    case 8:
                        if (arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i + 1][j]) {
                            count_local_max++;
                            continue;
                        }
                        else{
                            continue;
                        }
                    case 3:
                        if (arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i + 1][j]) {
                            count_local_max++;
                            continue;
                        }
                        else {
                            continue;
                        }

                    case 6:
                        if (arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i - 1][j]) {
                            count_local_max++;
                            continue;
                        }
                        else{
                            continue;
                        }
                    case 12:
                        if (arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i - 1][j]) {
                            count_local_max++;
                            continue;
                        }
                        else{
                            continue;
                        }
                    case 9:
                        if (arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i + 1][j]) {
                            count_local_max++;
                            continue;
                        }
                        else{
                            continue;
                        }
                    default:
                        if (arr[i][j] > arr[i][j - 1] && arr[i][j] > arr[i - 1][j] && arr[i][j] > arr[i][j + 1] && arr[i][j] > arr[i + 1][j]){
                            count_local_max++;
                        }
                }
            }
        }
        return count_local_max;
    }
}
