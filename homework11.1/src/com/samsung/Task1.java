package com.samsung;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] array = new int[a][b];

        //--------------------------

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int num = scanner.nextInt();
                array[i][j] = num;
            }
        }
        System.out.println(b + " " + a);
        for (int j = 0; j < b; j++) {
            for (int i = a - 1; i >= 0; i--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
