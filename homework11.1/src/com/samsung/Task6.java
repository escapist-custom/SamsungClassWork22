package com.samsung;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[2 * n + 1][2 * n + 1];
        int count = 0;
        int x = n;
        int y = n;
        //----------------------------

        for (int i = 0; i < 2 * n + 1; i++) {
            for (int j = 0; j < 2 * n + 1; j++) {
                array[i][j] = 0;
            }
        }
        while (count < Math.pow((2 * n - 1), 2)) {
            for (int i = 0; i < 2 * n + 1; i++) {
                if (y > 0) {
                    array[y][x] = count;
                    y--;
                    count++;
                }
            }
            for (int i = 0; i < 2 * n - 1; i++) {
                if (x > 0) {
                    array[y][x] = count;
                    x--;
                    count++;
                }
            }
            for (int i = 0; i < 2 * n + 1; i++) {
                if (y > 0) {
                    array[y][x] = count;
                    y++;
                    count++;
                }
            }
            for (int i = 0; i < 2 * n - 1; i++) {
                if (x > 0) {
                    array[y][x] = count;
                    x++;
                    count++;
                }
            }
        }
        printint(array);
    }
    public static void printint(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }


}
