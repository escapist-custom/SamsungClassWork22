package com.samsung;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] a;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        a = new int[n][m];
        int str = 0;
        int index = 0;
        for (int i = 0; i < n * m; i++) {
            if (index >= m) {
                index = 0;
                str++;
            }
            //---------
            a[str][index] = str * index;
            index++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
