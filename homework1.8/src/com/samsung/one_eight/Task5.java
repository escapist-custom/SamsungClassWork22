package com.samsung.one_eight;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int array[] = new int[n];

        for (int i = 1; i <= n; i++) {
            int num = scanner.nextInt();
            array[n-i] = num;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
