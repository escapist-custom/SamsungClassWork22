package com.samsung.one_seven;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int n;
        do {
            n = scanner.nextInt();
            if (n >= 10 && n <= 99) {
                sum += (n % 10) + (n / 10);
            }
        } while (n >= 10 && n <= 99);
        System.out.println(sum);
    }
}
