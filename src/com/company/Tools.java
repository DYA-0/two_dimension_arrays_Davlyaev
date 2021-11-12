package com.company;

import java.util.Random;

public class Tools {
    public static int[][] fill_2_dim_array_random_numbers(int[][] arr, int start, int end){
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr [i][j] = rnd.nextInt(end-start) + start;
            }
        }
        return arr;
    }
    public static double[][] fill_2_dim_array_random_numbers_double(double[][] arr, double start, double end){
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr [i][j] = rnd.nextDouble(end-start) + start;
                arr [i][j] = Math.round(arr[i][j]*10.0) / 10.0;
            }
        }
        return arr;
    }
    public static void print_1_dim_array_boolean (boolean[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr [i] + ", ");
        }
        System.out.println();
    }
    public static void print_1_dim_array_int (int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr [i] + ", ");
        }
        System.out.println();
    }
    public static void print_1_dim_array_double (double[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr [i] + ", ");
        }
        System.out.println();
    }
    public static void print_2_dim_array (int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr [i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void print_2_dim_array_double (double [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr [i][j] + " ");
            }
            System.out.println();
        }
    }
}
