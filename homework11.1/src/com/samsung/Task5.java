package com.samsung;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = count;
                count++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    if (array[i][j] < 10) {
                        System.out.print("  " + array[i][j]);
                    } else {
                        System.out.print(" " + array[i][j]);
                    }
                } else {
                    if (array[i][m - 1 - j] < 10) {
                        System.out.print("  " + array[i][m - 1 - j]);
                    } else {
                        System.out.print(" " + array[i][m - 1 - j]);
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
