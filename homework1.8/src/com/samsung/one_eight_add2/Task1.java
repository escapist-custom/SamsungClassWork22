package com.samsung.one_eight_add2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int[] ab = new int[b - a + 1];
        int[] cd = new int[d - c + 1];

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i >= a && i <= b) {
                ab[i] = count;
            }
            count++;
        }

        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i >= c && i <= d) {
                ab[i] = count;
            }
            count++;
        }


    }
}
