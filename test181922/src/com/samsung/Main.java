package com.samsung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array ={10, 29, 40, 3, 42, 23, 5, 5};
        int[] array1 ={140, 239, 4420, 3, 4, 42, 23, 5, 5};
        System.out.println(printArray1(array1));


    }

    public static void printArray(int[] array) {

        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");

    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static String printArray1(int[] array) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[");
        for (int i : array) {
            stringBuilder.append(i).append(" ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}