package com.samsung;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[2 * n + 1][2 * n + 1];
        int count = 0;
        //----------------------------
        int minRow = 0;
        int maxRow = 0;
        int minCol = 0;
        int maxCol = 0;
        //----------------------------

        for (int i = 0; i < 2 * n + 1; i++) {
            for (int j = 0; j < 2 * n + 1; j++) {
                array[i][j] = count;
                count++;
            }
        }
        count = 0;
        //---------------------------

        while (count != 2 * n) {
            for (int i = 0; i < 2 * n + 1; i++) {
                array[]
            }


            count++;
        }

        for (int i = 0; i < 2 * n + 1; i++) {
            for (int j = 0; j < 2 * n + 1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
