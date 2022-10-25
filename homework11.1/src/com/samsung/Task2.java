package com.samsung;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[][] table = new int[number][number];

        //--------------------------------------

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == j) table[i][number - 1 - j] = 1;
                if (i > j) table[i][number - 1 - j] = 2;
                if (j > i) table[i][number - 1 - j] = 0;
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
