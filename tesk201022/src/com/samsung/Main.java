package com.samsung;

public class Main {
    public static void main(String[] args) {

        int[][] array = new int[10][];

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[(int) (Math.random() * 10)];
        }

        fillArray(array, 50);

        printArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                    break;
                }
            }
        }

    }

    public static void fillArray(int[][] array, int limit) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * limit);
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
        System.out.println("\n");
    }
}