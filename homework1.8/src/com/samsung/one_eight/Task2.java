package com.samsung.one_eight;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        boolean fl = false;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                sum += num;
                fl = true;
            }
        }
        if (!fl) {
            System.out.println("NO");
        } else {
            System.out.println(sum);
        }
    }
}
