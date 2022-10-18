package com.samsung.one_eight_add1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 1;

        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        System.out.println(res);
    }
}
