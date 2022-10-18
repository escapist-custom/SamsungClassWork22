package com.samsung.one_eight_add1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 1; i <= n * n; i++) {
            if (i / n == i % n - 1 || i == n * n) {
                System.out.print(i + " ");
            }
        }
    }
}
